package com.bisa.helath.pay.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;


@Entity
@Table(name="s_trade",indexes={@Index(columnList="trade_guid")})
public class Trade {
	
	private int id;
	private String trade_no;  //交易编号
	private String order_guid;  //订单的guid
	private String price;  //价格
	private int user_guid;  //用户的唯一标识
	private String guid;  //当前区域服务器内的唯一id
	private int status;  //交易的状态 未付款；已付款
	private int pay_type; //付款的方式（1001:微信支付,1002:支付宝支付）
	private Date start_time;
	
	private int trade_guid;//	策略id,用于分表
	private String refund_price;   //退款金额：  (String)
	private String year;  //年：   (String)
	private String month;   // 月：(String)
	private String day;    // 日： (String)
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrade_no() {
		return trade_no;
	}
	public void setTrade_no(String trade_no) {
		this.trade_no = trade_no;
	}
	public String getOrder_guid() {
		return order_guid;
	}
	public void setOrder_guid(String order_guid) {
		this.order_guid = order_guid;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPay_type() {
		return pay_type;
	}
	public void setPay_type(int pay_type) {
		this.pay_type = pay_type;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	} //创建时间
	public int getTrade_guid() {
		return trade_guid;
	}
	public void setTrade_guid(int trade_guid) {
		this.trade_guid = trade_guid;
	}
	public String getRefund_price() {
		return refund_price;
	}
	public void setRefund_price(String refund_price) {
		this.refund_price = refund_price;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}
