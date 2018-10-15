package com.bisa.health.pay.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * 交易mode
 */

@Entity
@Table(name = "s_trade", indexes = {@Index(columnList = "trade_guid")})
public class Trade {

    private int id;
    private String trade_no;        //交易流水号
    private String order_no;          //订单编号
    private Integer user_guid;       //用户编号
    private BigDecimal price;         //付款的价格
    private Integer pay_location;    //1 电脑网页端  2 安卓手机 3 ios手机 4 电脑客户端
    private Integer pay_type;        //1 微信  2 支付宝  3 银联   4 visa
    private Integer pay_status;      //交易状态( 0:关闭订单 1：未支付，2：待发货，3：待收货 4:待评价 5：待追评 6 追评完成 7 退款成功  8 退款失败)

    private BigDecimal refund_price;//退款金额
    private Date refund_time;       //退款时间
    private Date create_time;       //创建时间(付款的时间)
    private Integer trade_guid;     //策略id,用于分表

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Integer getUser_guid() {
        return user_guid;
    }

    public void setUser_guid(Integer user_guid) {
        this.user_guid = user_guid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPay_location() {
        return pay_location;
    }

    public void setPay_location(Integer pay_location) {
        this.pay_location = pay_location;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Integer getPay_status() {
        return pay_status;
    }

    public void setPay_status(Integer pay_status) {
        this.pay_status = pay_status;
    }

    public BigDecimal getRefund_price() {
        return refund_price;
    }

    public void setRefund_price(BigDecimal refund_price) {
        this.refund_price = refund_price;
    }

    public Date getRefund_time() {
        return refund_time;
    }

    public void setRefund_time(Date refund_time) {
        this.refund_time = refund_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getTrade_guid() {
        return trade_guid;
    }

    public void setTrade_guid(Integer trade_guid) {
        this.trade_guid = trade_guid;
    }

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public Trade() {
        super();
    }

    @Override
    public String toString() {
        return "Trade [id=" + id + ", order_no=" + order_no + ", user_guid=" + user_guid + ", price=" + price
                + ", pay_location=" + pay_location + ", pay_type=" + pay_type + ", pay_status=" + pay_status
                + ", refund_price=" + refund_price + ", refund_time=" + refund_time + ", create_time=" + create_time
                + ", trade_guid=" + trade_guid + ", trade_no=" + trade_no + "]";
    }

}
