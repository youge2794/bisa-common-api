package com.bisa.health.shop.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="s_goods_preferential_price")
public class GoodsPreferentialPrice {
	private Integer id;
	private Integer classify_id; 	 	//商品分类编号
	private String goods_number_id;		//商品编号

	private Integer count;   //套餐内单品数量

	private String goods_name;			//商品名字
	private BigDecimal goods_price;			//单价  1000
	private BigDecimal preferential_price;	//优惠价格  800
	
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

	public String getGoods_number_id() {
		return goods_number_id;
	}

	public void setGoods_number_id(String goods_number_id) {
		this.goods_number_id = goods_number_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public BigDecimal getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(BigDecimal goods_price) {
		this.goods_price = goods_price;
	}

	public BigDecimal getPreferential_price() {
		return preferential_price;
	}

	public void setPreferential_price(BigDecimal preferential_price) {
		this.preferential_price = preferential_price;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "GoodsPreferentialPrice [id=" + id + ", classify_id=" + classify_id + ", goods_number_id="
				+ goods_number_id + ", goods_name=" + goods_name + ", goods_price=" + goods_price
				+ ", preferential_price=" + preferential_price + "]";
	}
	
	

}