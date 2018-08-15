package com.bisa.health.shop.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="s_goods_preferential_price")
public class GoodsPreferentialPrice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6928121695837409247L;
	private Integer id;
	private Integer classifyId; 	 	//商品分类编号
	private String goodsNumber;		//商品编号
	private Integer count;   //套餐内单品数量
	private String goodsName;			//商品名字
	private BigDecimal goodsPrice;			//单价  1000
	private BigDecimal preferentialPrice;	//优惠价格  800
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="classify_id")
	public Integer getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}
	@Column(name="goods_number")
	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	@Column(name="goods_name")
	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	@Column(name="goods_price")
	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	@Column(name="preferential_price")
	public BigDecimal getPreferentialPrice() {
		return preferentialPrice;
	}

	public void setPreferentialPrice(BigDecimal preferentialPrice) {
		this.preferentialPrice = preferentialPrice;
	}

	public GoodsPreferentialPrice() {
		super();
	}

	public GoodsPreferentialPrice(Integer id, Integer classifyId, String goodsNumber, Integer count, String goodsName,
			BigDecimal goodsPrice, BigDecimal preferentialPrice) {
		super();
		this.id = id;
		this.classifyId = classifyId;
		this.goodsNumber = goodsNumber;
		this.count = count;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
		this.preferentialPrice = preferentialPrice;
	}

	@Override
	public String toString() {
		return "GoodsPreferentialPrice [id=" + id + ", classifyId=" + classifyId + ", goodsNumber=" + goodsNumber
				+ ", count=" + count + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", preferentialPrice=" + preferentialPrice + "]";
	}

}