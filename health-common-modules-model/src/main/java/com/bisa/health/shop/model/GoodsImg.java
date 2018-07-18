package com.bisa.health.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_goods_img")
public class GoodsImg {
	private Integer id;
	private String goods_number_id;	//商品编号
	private String goods_img_url;	// 商品图片地址
	private String position;		//位置
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGoods_number_id() {
		return goods_number_id;
	}

	public void setGoods_number_id(String goods_number_id) {
		this.goods_number_id = goods_number_id;
	}

	public String getGoods_img_url() {
		return goods_img_url;
	}

	public void setGoods_img_url(String goods_img_url) {
		this.goods_img_url = goods_img_url;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position == null ? null : position.trim();
	}

	@Override
	public String toString() {
		return "GoodsImg [id=" + id + ", goods_number_id=" + goods_number_id + ", goods_img_url=" + goods_img_url
				+ ", position=" + position + "]";
	}
	
	
}