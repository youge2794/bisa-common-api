package com.bisa.health.shop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_goods")
public class Goods implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4256398755051915154L;
	private Integer id;
	private Integer classify_id;    //商品分类编号
	private String goods_name;      //商品名字
	private String goods_number;	//商品编号
	
	private String title;  			//商品大标题
	private String description;		//商品描述
	private BigDecimal goods_price;		//单价
	private Integer store_number;   //商品库存数量
	private String need_post;		//0-不需要邮递；1-需要邮递
	
	private Date putaway_time;		//上架时间
	private Date sold_out_time;		//下架时间
	private Integer sales_number;	//销量
	private Integer appraise_number;//评论数量
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(Integer classify_id) {
		this.classify_id = classify_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_number() {
		return goods_number;
	}

	public void setGoods_number(String goods_number) {
		this.goods_number = goods_number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(BigDecimal goods_price) {
		this.goods_price = goods_price;
	}

	public Integer getStore_number() {
		return store_number;
	}

	public void setStore_number(Integer store_number) {
		this.store_number = store_number;
	}

	public String getNeed_post() {
		return need_post;
	}

	public void setNeed_post(String need_post) {
		this.need_post = need_post;
	}

	public Date getPutaway_time() {
		return putaway_time;
	}

	public void setPutaway_time(Date putaway_time) {
		this.putaway_time = putaway_time;
	}

	public Date getSold_out_time() {
		return sold_out_time;
	}

	public void setSold_out_time(Date sold_out_time) {
		this.sold_out_time = sold_out_time;
	}

	public Integer getSales_number() {
		return sales_number;
	}

	public void setSales_number(Integer sales_number) {
		this.sales_number = sales_number;
	}

	public Integer getAppraise_number() {
		return appraise_number;
	}

	public void setAppraise_number(Integer appraise_number) {
		this.appraise_number = appraise_number;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", classify_id=" + classify_id + ", goods_name=" + goods_name + ", goods_number="
				+ goods_number + ", title=" + title + ", description=" + description + ", goods_price=" + goods_price
				+ ", store_number=" + store_number + ", need_post=" + need_post + ", putaway_time=" + putaway_time
				+ ", sold_out_time=" + sold_out_time + ", sales_number=" + sales_number + ", appraise_number="
				+ appraise_number + "]";
	}

}