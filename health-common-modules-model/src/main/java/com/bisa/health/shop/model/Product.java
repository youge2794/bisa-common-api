package com.bisa.health.shop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品
 * @author Administrator
 *
 */
@Entity
@Table(name="s_product")
public class Product {
	
	private int id;             //商品编号
	private String product_name;//商品名称
	
	private String title;		//商品大标题
	private String description; //主描述
	private Double price;	    //单价
	
	private int classification;	//分类（心电仪，摄像头，血压计等）
	private int priority;       //优先级
	private int type;           //商品类别（主商品，配件，服务）
	private int is_have;        //是否有货 0-无货；1-有货
	private int need_post;      //是否需要邮递  0-不需要邮递；2-需要邮递
	
	private int img_id;         //图片id
	private Date insertime;     //上架时间
	private String lang;        //语言版本
	
	//private int is_valid;     //是否有效（上架、下架）
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getClassification() {
		return classification;
	}

	public void setClassification(int classification) {
		this.classification = classification;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getImg_id() {
		return img_id;
	}

	public void setImg_id(int img_id) {
		this.img_id = img_id;
	}

	public Date getInsertime() {
		return insertime;
	}

	public void setInsertime(Date insertime) {
		this.insertime = insertime;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getIs_have() {
		return is_have;
	}

	public void setIs_have(int is_have) {
		this.is_have = is_have;
	}

	public int getNeed_post() {
		return need_post;
	}

	public void setNeed_post(int need_post) {
		this.need_post = need_post;
	}
	
	
}
