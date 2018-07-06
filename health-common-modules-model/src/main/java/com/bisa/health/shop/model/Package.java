package com.bisa.health.shop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "s_package")
public class Package {

	private int id;
	private String package_number;
	private String package_name;
	private String patitle;
	private String sub_descrition;
	private Double price;
	private String product_id;
	private int orderId;
	private String main_picture;
	private String pic1_picture;
	private String pic2_picuture;
	private String pic3_picuture;
	private String pic4_picuture;
	private Date insert_time;
	private Date update_time;
	private int need_post;
	private String lang;

	@Id
	@GeneratedValue
	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPackage_number() {
		return package_number;
	}

	public void setPackage_number(String package_number) {
		this.package_number = package_number;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public String getPatitle() {
		return patitle;
	}

	public void setPatitle(String patitle) {
		this.patitle = patitle;
	}

	public String getSub_descrition() {
		return sub_descrition;
	}

	public void setSub_descrition(String sub_descrition) {
		this.sub_descrition = sub_descrition;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMain_picture() {
		return main_picture;
	}

	public void setMain_picture(String main_picture) {
		this.main_picture = main_picture;
	}

	public String getPic1_picture() {
		return pic1_picture;
	}

	public void setPic1_picture(String pic1_picture) {
		this.pic1_picture = pic1_picture;
	}

	public String getPic2_picuture() {
		return pic2_picuture;
	}

	public void setPic2_picuture(String pic2_picuture) {
		this.pic2_picuture = pic2_picuture;
	}

	public String getPic3_picuture() {
		return pic3_picuture;
	}

	public void setPic3_picuture(String pic3_picuture) {
		this.pic3_picuture = pic3_picuture;
	}

	public String getPic4_picuture() {
		return pic4_picuture;
	}

	public void setPic4_picuture(String pic4_picuture) {
		this.pic4_picuture = pic4_picuture;
	}

	public Date getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getNeed_post() {
		return need_post;
	}

	public void setNeed_post(int need_post) {
		this.need_post = need_post;
	}

	public Package() {
		super();
	}

	public Package(int id, String package_number, String package_name, String patitle, String sub_descrition,
			Double price, String product_id, int orderId, String main_picture, String pic1_picture,
			String pic2_picuture, String pic3_picuture, String pic4_picuture, Date insert_time, Date update_time) {
		super();
		this.id = id;
		this.package_number = package_number;
		this.package_name = package_name;
		this.patitle = patitle;
		this.sub_descrition = sub_descrition;
		this.price = price;
		this.product_id = product_id;
		this.orderId = orderId;
		this.main_picture = main_picture;
		this.pic1_picture = pic1_picture;
		this.pic2_picuture = pic2_picuture;
		this.pic3_picuture = pic3_picuture;
		this.pic4_picuture = pic4_picuture;
		this.insert_time = insert_time;
		this.update_time = update_time;
	}

}
