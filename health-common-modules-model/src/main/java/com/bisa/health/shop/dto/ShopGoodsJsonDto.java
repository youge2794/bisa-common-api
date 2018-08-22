package com.bisa.health.shop.dto;

import java.io.Serializable;

/**
 * 通用于商品详情页、
 * 确认订单和提交订单的dto
 * @author Administrator
 *
 */
public class ShopGoodsJsonDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8998859267383094194L;

	private GoodsPackagesDto goodsPackagesDto;
	
	private Integer classifyId;
	
	private String description;
	
	private String imgUrl;
	
	public GoodsPackagesDto getGoodsPackagesDto() {
		return goodsPackagesDto;
	}

	public void setGoodsPackagesDto(GoodsPackagesDto goodsPackagesDto) {
		this.goodsPackagesDto = goodsPackagesDto;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public ShopGoodsJsonDto() {
		super();
	}

	public ShopGoodsJsonDto(GoodsPackagesDto goodsPackagesDto, Integer classifyId, String description, String imgUrl) {
		super();
		this.goodsPackagesDto = goodsPackagesDto;
		this.classifyId = classifyId;
		this.description = description;
		this.imgUrl = imgUrl;
	}
	
}
