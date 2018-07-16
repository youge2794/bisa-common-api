package com.bisa.health.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_goods_shopcar")
public class GoodsShopcar {
	private Integer id;
	private Integer user_id;		//用户id
	private String goods_number_id; //商品编号
	private Integer count;			// 商品的数量
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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}