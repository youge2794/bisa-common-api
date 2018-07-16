package com.bisa.health.shop.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_order_goods")
public class OrderGoods {
	private Integer id;
	private Integer order_id;        //订单id
	private String goods_number_id;  //商品编号
	
	private Integer count;			 //购买的商品数量
	private BigDecimal goods_price;		 //(下单时间的价格，不会根据变价而改动)单价  1000
	private BigDecimal preferential_price; //(下单时间的价格，不会根据变价而改动)优惠价格  800
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public String getGoods_number_id() {
		return goods_number_id;
	}

	public void setGoods_number_id(String goods_number_id) {
		this.goods_number_id = goods_number_id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
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

}