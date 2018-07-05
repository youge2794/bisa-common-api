package com.bisa.hkshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 改版套餐表
 * @author Kiki Ye
 *
 */
@Entity
@Table(name = "s_packages")
public class Packages {

	private int id;
	private int package_number;  //套餐id
	private String package_name;   //套餐名称
	private String sub_title;  //套餐摘要
	private int product_id;   //商品id
	private String product_name;  //商品名称
	private int amount;  //商品数量
	private double fix_price;  //商品原价（固定价格）
	private double discount_price;  //优惠价
	private int is_main;   //是否主商品
	private int priority;   //优先级
	private int need_post;  //是否需要邮递
	private String main_pic;  //商品主图
	
	private Date insert_time;   //套餐上架时间

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPackage_number() {
		return package_number;
	}

	public void setPackage_number(int package_number) {
		this.package_number = package_number;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public Date getInsert_time() {
		return insert_time;
	}

	public void setInsert_time(Date insert_time) {
		this.insert_time = insert_time;
	}

	public String getSub_title() {
		return sub_title;
	}

	public void setSub_title(String sub_title) {
		this.sub_title = sub_title;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getFix_price() {
		return fix_price;
	}

	public void setFix_price(double fix_price) {
		this.fix_price = fix_price;
	}

	public double getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(double discount_price) {
		this.discount_price = discount_price;
	}

	public int getIs_main() {
		return is_main;
	}

	public void setIs_main(int is_main) {
		this.is_main = is_main;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int prority) {
		this.priority = prority;
	}

	public int getNeed_post() {
		return need_post;
	}

	public void setNeed_post(int need_post) {
		this.need_post = need_post;
	}

	public String getMain_pic() {
		return main_pic;
	}

	public void setMain_pic(String main_pic) {
		this.main_pic = main_pic;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Packages() {
		super();
	}
	

}
