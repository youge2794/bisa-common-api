package com.bisa.health.shop.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_order")
public class Order {
	private Integer id;
	private String order_no;         //订单号
	private Integer user_id;		 //买家id
	private String consignee;		 // 收货人名字
	private String phone; 			// 收货人手机号码
	
	private String detail_address;   // 详细地址
	
	private String tra_status;		 //交易状态（0:取消，1：未支付，2：待发货，3：待收货  4:待评价  5：待追评
	private String pay_type;		 //1 支付宝   2 微信  3 银联
	private Date pay_time;			 //支付时间
	private Date deliver_goods_time; //发货时间
	private Date receive_goods_time; //收货时间
	
	private String after_sale_apply; //1 可以申请售后, 2  售后处理中
	private BigDecimal total_price;		 //订单商品总价(不包含 邮费的价格) 2000
	private BigDecimal post_price;		 //邮费                          			 100
	
	private BigDecimal preferential_price; //优惠价格         			 （优惠了100)
	private BigDecimal actual_payment;      //实际 付款价格				2000
	
	private String logistics_number; //物流单号
	private String logistics_name;	 //物流公司名
	private Date create_time;		 //订单创建时间
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	public String getConsignee() {
		return consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDetail_address() {
		return detail_address;
	}

	public void setDetail_address(String detail_address) {
		this.detail_address = detail_address;
	}

	public BigDecimal getActual_payment() {
		return actual_payment;
	}

	public void setActual_payment(BigDecimal actual_payment) {
		this.actual_payment = actual_payment;
	}

	public String getTra_status() {
		return tra_status;
	}

	public void setTra_status(String tra_status) {
		this.tra_status = tra_status;
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}

	public Date getDeliver_goods_time() {
		return deliver_goods_time;
	}

	public void setDeliver_goods_time(Date deliver_goods_time) {
		this.deliver_goods_time = deliver_goods_time;
	}

	public Date getReceive_goods_time() {
		return receive_goods_time;
	}

	public void setReceive_goods_time(Date receive_goods_time) {
		this.receive_goods_time = receive_goods_time;
	}

	public String getAfter_sale_apply() {
		return after_sale_apply;
	}

	public void setAfter_sale_apply(String after_sale_apply) {
		this.after_sale_apply = after_sale_apply;
	}

	public BigDecimal getTotal_price() {
		return total_price;
	}

	public void setTotal_price(BigDecimal total_price) {
		this.total_price = total_price;
	}

	public BigDecimal getPreferential_price() {
		return preferential_price;
	}

	public void setPreferential_price(BigDecimal preferential_price) {
		this.preferential_price = preferential_price;
	}

	public BigDecimal getPost_price() {
		return post_price;
	}

	public void setPost_price(BigDecimal post_price) {
		this.post_price = post_price;
	}

	public String getLogistics_number() {
		return logistics_number;
	}

	public void setLogistics_number(String logistics_number) {
		this.logistics_number = logistics_number;
	}

	public String getLogistics_name() {
		return logistics_name;
	}

	public void setLogistics_name(String logistics_name) {
		this.logistics_name = logistics_name;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", order_no=" + order_no + ", user_id=" + user_id + ", consignee=" + consignee
				+ ", phone=" + phone + ", detail_address=" + detail_address + ", tra_status=" + tra_status
				+ ", pay_type=" + pay_type + ", pay_time=" + pay_time + ", deliver_goods_time=" + deliver_goods_time
				+ ", receive_goods_time=" + receive_goods_time + ", after_sale_apply=" + after_sale_apply
				+ ", total_price=" + total_price + ", post_price=" + post_price + ", preferential_price="
				+ preferential_price + ", actual_payment=" + actual_payment + ", logistics_number=" + logistics_number
				+ ", logistics_name=" + logistics_name + ", create_time=" + create_time + "]";
	}

}