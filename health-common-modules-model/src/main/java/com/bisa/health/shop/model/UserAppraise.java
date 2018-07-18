package com.bisa.health.shop.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="s_user_appraise")
public class UserAppraise {
	private Integer id;
	private Integer user_id;  		//评价人id
	private String goods_number_id; //商品编号
	
	private String appraise_one;	//评价内容
	private String appraise_two;	//追评内容
	private String appraise_degree; //评价程度 （失望：1,一般：2,满意：3,喜爱：4,超爱：5
	
	private Date appraise_one_time; //评价时间
	private Date appraise_two_time; //追评时间
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getGoods_number_id() {
		return goods_number_id;
	}

	public void setGoods_number_id(String goods_number_id) {
		this.goods_number_id = goods_number_id;
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

	public String getAppraise_degree() {
		return appraise_degree;
	}

	public void setAppraise_degree(String appraise_degree) {
		this.appraise_degree = appraise_degree;
	}

	public Date getAppraise_one_time() {
		return appraise_one_time;
	}

	public void setAppraise_one_time(Date appraise_one_time) {
		this.appraise_one_time = appraise_one_time;
	}

	public Date getAppraise_two_time() {
		return appraise_two_time;
	}

	public void setAppraise_two_time(Date appraise_two_time) {
		this.appraise_two_time = appraise_two_time;
	}

	@Override
	public String toString() {
		return "UserAppraise [id=" + id + ", user_id=" + user_id + ", goods_number_id=" + goods_number_id
				+ ", appraise_one=" + appraise_one + ", appraise_two=" + appraise_two + ", appraise_degree="
				+ appraise_degree + ", appraise_one_time=" + appraise_one_time + ", appraise_two_time="
				+ appraise_two_time + "]";
	}
	
	

}