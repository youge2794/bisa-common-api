package com.bisa.health.shop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="s_appraise",indexes={@Index(columnList="product_guid")})
public class Appraise {
    private int id;
    private String appraise_no;//编号
    private String product_number;//商品编号
    private String main_picture;   //主图
    private Double price;     //价格
    private String title;    //标题
    private String appraise_one;     //评价
    private String appraise_two;     //追评
    private int appraise_degree;   //评价程度 （失望：1,一般：2,满意：3,喜爱：4,超爱：5）
    private int appraise_status;    //评价状态（1：评价  2:追评)
    private int user_guid;         //用户编号
    private Date insert_time;       //插入时间
    private Date update_time;        //更新时间
    private String order_detail_guid;         //订单详细编号
    private String userImg;    //用户头像
    private int product_guid;//商品唯一编号
    private String nick_name;//用户昵称
	@Id
	@GeneratedValue
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppraise_no() {
		return appraise_no;
	}
	public void setAppraise_no(String appraise_no) {
		this.appraise_no = appraise_no;
	}
	public String getProduct_number() {
		return product_number;
	}
	public void setProduct_number(String product_number) {
		this.product_number = product_number;
	}
	public String getMain_picture() {
		return main_picture;
	}
	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAppraise_one() {
		return appraise_one;
	}
	public void setAppraise_one(String appraise_one) {
		this.appraise_one = appraise_one;
	}
	public String getAppraise_two() {
		return appraise_two;
	}
	public void setAppraise_two(String appraise_two) {
		this.appraise_two = appraise_two;
	}
	public int getAppraise_degree() {
		return appraise_degree;
	}
	public void setAppraise_degree(int appraise_degree) {
		this.appraise_degree = appraise_degree;
	}
	public int getAppraise_status() {
		return appraise_status;
	}
	public void setAppraise_status(int appraise_status) {
		this.appraise_status = appraise_status;
	}
	
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
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
	public String getOrder_detail_guid() {
		return order_detail_guid;
	}
	public void setOrder_detail_guid(String order_detail_guid) {
		this.order_detail_guid = order_detail_guid;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public int getProduct_guid() {
		return product_guid;
	}
	public void setProduct_guid(int product_guid) {
		this.product_guid = product_guid;
	}
	
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	
    
}
