package com.bisa.health.shop.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_classify")
public class Classify implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8538977431012879661L;
	
	private Integer id;
	private String classifyName;      //分类名称
	private Integer superId; 		   //父分类编号

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="classify_name")
	public String getClassifyName() {
		return classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}
	@Column(name="super_id")
	public Integer getSuperId() {
		return superId;
	}

	public void setSuperId(Integer superId) {
		this.superId = superId;
	}

	public Classify() {
		super();
	}

	public Classify(Integer id, String classifyName, Integer superId) {
		super();
		this.id = id;
		this.classifyName = classifyName;
		this.superId = superId;
	}

	@Override
	public String toString() {
		return "Classify [id=" + id + ", classifyName=" + classifyName + ", superId=" + superId + "]";
	}

}