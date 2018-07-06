package com.bisa.health.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_commodity_img")
public class CommodityImg {

	private int id;
	private String img_no;
	private String pic;
	private int type;
	private String product_id;
	private String product_title;
	private double priduct_price;
	
	private String lang;
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg_no() {
		return img_no;
	}
	public void setImg_no(String img_no) {
		this.img_no = img_no;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public double getPriduct_price() {
		return priduct_price;
	}
	public void setPriduct_price(double priduct_price) {
		this.priduct_price = priduct_price;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
}
