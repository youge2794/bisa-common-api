package com.bisa.health.shop.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="s_order",indexes={@Index(columnList="user_guid")})
public class Order implements Serializable{
	
	private static final long serialVersionUID = 6575392316064318504L;
	
	private	int	id; 	//	id
	private	String order_no; 	//	32	订单号
	private	int user_guid; 	//	36	用户
	private String guid ;      // 区域服务器的唯一id
	//
	private	int tra_status; 	//	11	交易状态（1：未支付，2：已支付 3：未发货，4：已发货）
	private	String addr_num; 	//	100	收货地址guid
	private	String price; 	//	36	总价
	private int pay_type;     //付款方式(1001:微信 1002：支付宝）
	private double reduced_price;   //优惠价格
	private double post_price;   //邮费
	private	String logistics_number; 	//	100	物流单号
	private	String logistics_name; 	//	100	物流公司名
	private	Date start_time; 	//	50	创建时间
	private Date order_fail_time; //订单失效时间
	private	Date update_time; 	//	50	订单更改时间
	private	Date pay_ok_time; 	//	50	支付成功时间
	private	Date trade_ok_time; 	//	50	交易成功时间
	private	Date trade_false_time; 	//	50	交易失败时间
	private String trade_fail_cause;//交易失败的原因
	private	String invoice_title; 	//	50	发票抬头
	private	int invoice_type; 	//	50	发票类型（0：增值税发票，1：普通发票）
	private int effective_statu;//订单是否有效 1:有效 2:无效
	private int appraise_status; //评价是否：1有效2：无效
	
	private	String county;
	private	String tel;		//	20	电话
	private	String name;		//	20	收货人
	private String shop_app; //区别0：商城 1：app
	
	private String address;
	private String email;
	
	@Column(name="allocationofcargo_time")
	private Date allocationofcargo_time;   //配货时间
	
	@Column(name="deliveryofcargo_time")
	private Date deliveryofcargo_time;     //出库时间
		
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
	public int getTra_status() {
		return tra_status;
	}
	public void setTra_status(int tra_status) {
		this.tra_status = tra_status;
	}
	public String getAddr_num() {
		return addr_num;
	}
	public void setAddr_num(String addr_num) {
		this.addr_num = addr_num;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getPay_type() {
		return pay_type;
	}
	public void setPay_type(int pay_type) {
		this.pay_type = pay_type;
	}
	public double getReduced_price() {
		return reduced_price;
	}
	public void setReduced_price(double reduced_price) {
		this.reduced_price = reduced_price;
	}
	public double getPost_price() {
		return post_price;
	}
	public void setPost_price(double post_price) {
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
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getOrder_fail_time() {
		return order_fail_time;
	}
	public void setOrder_fail_time(Date order_fail_time) {
		this.order_fail_time = order_fail_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public Date getPay_ok_time() {
		return pay_ok_time;
	}
	public void setPay_ok_time(Date pay_ok_time) {
		this.pay_ok_time = pay_ok_time;
	}
	public Date getTrade_ok_time() {
		return trade_ok_time;
	}
	public void setTrade_ok_time(Date trade_ok_time) {
		this.trade_ok_time = trade_ok_time;
	}
	public Date getTrade_false_time() {
		return trade_false_time;
	}
	public void setTrade_false_time(Date trade_false_time) {
		this.trade_false_time = trade_false_time;
	}
	public String getTrade_fail_cause() {
		return trade_fail_cause;
	}
	public void setTrade_fail_cause(String trade_fail_cause) {
		this.trade_fail_cause = trade_fail_cause;
	}
	public String getInvoice_title() {
		return invoice_title;
	}
	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}
	public int getInvoice_type() {
		return invoice_type;
	}
	public void setInvoice_type(int invoice_type) {
		this.invoice_type = invoice_type;
	}
	public int getEffective_statu() {
		return effective_statu;
	}
	public void setEffective_statu(int effective_statu) {
		this.effective_statu = effective_statu;
	} //订单是否有效，（1：有效，2：无效）
	public int getAppraise_status() {
		return appraise_status;
	}
	public void setAppraise_status(int appraise_status) {
		this.appraise_status = appraise_status;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShop_app() {
		return shop_app;
	}
	public void setShop_app(String shop_app) {
		this.shop_app = shop_app;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getAllocationofcargo_time() {
		return allocationofcargo_time;
	}
	public void setAllocationofcargo_time(Date allocationofcargo_time) {
		this.allocationofcargo_time = allocationofcargo_time;
	}
	public Date getDeliveryofcargo_time() {
		return deliveryofcargo_time;
	}
	public void setDeliveryofcargo_time(Date deliveryofcargo_time) {
		this.deliveryofcargo_time = deliveryofcargo_time;
	}
	
}
