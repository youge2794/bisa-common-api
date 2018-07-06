package com.bisa.health.shop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
@Entity
@Table(name="s_order_detail",indexes={@Index(columnList="user_guid")})
public class OrderDetail {
	
	private int id ;
	private String order_detail_guid;//订单详细表的唯一id
	private String order_no;//订单表中的guid,表示隶属于那个订单
	private String ascription;//属于商品，还是属于套餐（1:商品,2:套餐）;
	private String ascription_guid;//商品或者套餐的guid
	private int count;//套餐或者商品的数量
	private String pic;//套餐或者商品的的图片
	private String product_name;//商品名或者套餐名
	private Date start_time;//创建时间
	private double price;
	private	int user_guid; 	//	36	用户
	private int appraise_status; //是否评价  1为没评价；2-已评价；3-失效
	private	int tra_status; 	//	11	交易状态
	private int product_salt_apply;  //0的时候代表售后处理中，等于1的时候代表可以申请售后，
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrder_detail_guid() {
		return order_detail_guid;
	}
	public void setOrder_detail_guid(String order_detail_guid) {
		this.order_detail_guid = order_detail_guid;
	}
	public String getOrder_no() {
		return order_no;
	}
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}
	public String getAscription() {
		return ascription;
	}
	public void setAscription(String ascription) {
		this.ascription = ascription;
	}
	public String getAscription_guid() {
		return ascription_guid;
	}
	public void setAscription_guid(String ascription_guid) {
		this.ascription_guid = ascription_guid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}//价格

	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public int getAppraise_status() {
		return appraise_status;
	}
	public void setAppraise_status(int appraise_status) {
		this.appraise_status = appraise_status;
	}
	public int getTra_status() {
		return tra_status;
	}
	public void setTra_status(int tra_status) {
		this.tra_status = tra_status;
	}
	public int getProduct_salt_apply() {
		return product_salt_apply;
	}
	public void setProduct_salt_apply(int product_salt_apply) {
		this.product_salt_apply = product_salt_apply;
	}
	
}
