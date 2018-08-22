package com.bisa.health.shop.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用于 购物车显示 的封装DTO  子类
 * 单品和套餐共用
 * @author Administrator
 *
 */
public class GoodsPackagesDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3802486884191151562L;

	private Integer id;
	
	private String goodsName;      //商品名字
	
	private String goodsNumber;	//商品编号
	
	private BigDecimal goodsPrice;		//单价
	
	private BigDecimal preferentialPrice;	//优惠价格  800
	
	private Integer count;   //套餐内单品数量
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public BigDecimal getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(BigDecimal goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public BigDecimal getPreferentialPrice() {
		return preferentialPrice;
	}

	public void setPreferentialPrice(BigDecimal preferentialPrice) {
		this.preferentialPrice = preferentialPrice;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public GoodsPackagesDto() {
		super();
	}

	public GoodsPackagesDto(Integer id, String goodsName, String goodsNumber, BigDecimal goodsPrice,
			BigDecimal preferentialPrice, Integer count) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsNumber = goodsNumber;
		this.goodsPrice = goodsPrice;
		this.preferentialPrice = preferentialPrice;
		this.count = count;
	}
}
