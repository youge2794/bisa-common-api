package com.bisa.health.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品图片类
 * @author Administrator
 *
 */
@Entity
@Table(name="s_product_img")
public class ProductImg {
	
	private int id;
	
	private int product_id;  //商品id
	
	private String pic_url; //图片url
	
	private int position;  //图片位置
	
	private int priority; //优先级
	
	private int is_main;  //是否主图
	
	private String lang;   //语言版本

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getPic_url() {
		return pic_url;
	}

	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getIs_main() {
		return is_main;
	}

	public void setIs_main(int is_main) {
		this.is_main = is_main;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	

}
