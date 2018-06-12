package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
/**
 * 购物车
 * @author wqc
 *
 */

@Entity
@Table(name="s_cart",indexes={@Index(columnList="user_guid")})
public class Cart {
	private int id;
	private String cart_number;	//购物车编号
	private String guid;  //用户编号
	private int number;//商品数量
	private Double price; //价格
	private String packId;   //商品id
	private Double total;    //总价 
	private String title;   //商品名称
	private String main_picture;  //商品主图
	private String sing_cox;   //单品或套餐
	private	int user_guid; 	//	36	用户唯一编码
	private Date insert_time;   //购物车创建时间
	private Date update_time;   //修改时间
 
	public Cart() {
		super();
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCart_number() {
		return cart_number;
	}
	public void setCart_number(String cart_number) {
		this.cart_number = cart_number;
	}
	
	
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getPackId() {
		return packId;
	}
	public void setPackId(String packId) {
		this.packId = packId;
	}
	
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getMain_picture() {
		return main_picture;
	}
	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}
	
	public Date getInsert_time() {
		return insert_time;
	}
	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	public String getSing_cox() {
		return sing_cox;
	}
	public void setSing_cox(String sing_cox) {
		this.sing_cox = sing_cox;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}


	

	
	
	
}
