package com.bisa.health.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="e_area")
public class Area implements Serializable {
	
	private static final long serialVersionUID = -6873825873353788809L;
	private int id;
	private String area_name;//中文名称
	private String phone_code;//86
	private String time_zone;//时区
	private String area_code;//缩写
	
	private String area_en_name;//英文名字
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getArea_code() {
		return area_code;
	}
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	
	public String getPhone_code() {
		return phone_code;
	}
	public void setPhone_code(String phone_code) {
		this.phone_code = phone_code;
	}
	public String getArea_en_name() {
		return area_en_name;
	}
	public void setArea_en_name(String area_en_name) {
		this.area_en_name = area_en_name;
	}
	
	public Area() {
		super();
	}
	public Area(int id, String area_name, String phone_code, String time_zone, String area_code, String area_en_name) {
		super();
		this.id = id;
		this.area_name = area_name;
		this.phone_code = phone_code;
		this.time_zone = time_zone;
		this.area_code = area_code;
		this.area_en_name = area_en_name;
	}

}
