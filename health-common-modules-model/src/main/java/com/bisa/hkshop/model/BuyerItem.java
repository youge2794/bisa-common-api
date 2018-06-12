package com.bisa.hkshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="s_buyer_item",indexes={@Index(columnList="user_guid")})
public class BuyerItem {
	
	private int id;
	
	private int user_guid;  //用户唯一编码
	
	private int product_id;  //商品id
	
	private Double price;  //单价
	
	private int amount;  //数量
	
	private int is_have;   //是否有货 0-无货；1-有货
	
	private int need_post;  //是否需要邮递  0-不需要邮递；2-需要邮递

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_guid() {
		return user_guid;
	}

	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}


	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getIs_have() {
		return is_have;
	}

	public void setIs_have(int is_have) {
		this.is_have = is_have;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getNeed_post() {
		return need_post;
	}

	public void setNeed_post(int need_post) {
		this.need_post = need_post;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public BuyerItem(int id, int user_guid, int product_id, Double price, int amount, int is_have,
			int need_post) {
		super();
		this.id = id;
		this.user_guid = user_guid;
		this.product_id = product_id;
		this.price = price;
		this.amount = amount;
		this.is_have = is_have;
		this.need_post = need_post;
	}

	public BuyerItem() {
		super();
	}
	
}
