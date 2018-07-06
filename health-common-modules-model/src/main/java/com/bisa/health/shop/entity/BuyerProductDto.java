package com.bisa.health.shop.entity;

import com.bisa.health.shop.model.BuyerItem;

/**
 * 用于显示到页面的dto
 * @author Administrator
 *
 */
public class BuyerProductDto{

	private int product_id;
	
	private String product_name;
	
	private Double price;
	
	private String pic_url;
	
	private int amount;  //数量
	
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BuyerProductDto loadBuyerCartDto(String pic_url, BuyerItem buyerItem) {
		BuyerProductDto buyerProductDto = new BuyerProductDto();
		buyerProductDto.setProduct_id(buyerItem.getProduct_id());
		buyerProductDto.setAmount(buyerItem.getAmount());
		buyerProductDto.setPrice(buyerItem.getPrice());
		buyerProductDto.setPic_url(pic_url);
		return buyerProductDto;
	}

		
}
