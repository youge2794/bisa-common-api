package com.bisa.health.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_classify")
public class Classify {
	private Integer id;
	private String classify_name;      //分类名称
	private Integer highest_super_id;   //顶级分类编号
	private Integer super_id; 		   //父分类编号

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassify_name() {
		return classify_name;
	}

	public void setClassify_name(String classify_name) {
		this.classify_name = classify_name;
	}

	public Integer getHighest_super_id() {
		return highest_super_id;
	}

	public void setHighest_super_id(Integer highest_super_id) {
		this.highest_super_id = highest_super_id;
	}

	public Integer getSuper_id() {
		return super_id;
	}

	public void setSuper_id(Integer super_id) {
		this.super_id = super_id;
	}

	@Override
	public String toString() {
		return "Classify [id=" + id + ", classify_name=" + classify_name + ", highest_super_id=" + highest_super_id
				+ ", super_id=" + super_id + "]";
	}
	
	

}