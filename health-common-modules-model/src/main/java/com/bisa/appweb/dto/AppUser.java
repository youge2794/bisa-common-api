package com.bisa.appweb.dto;

import com.bisa.health.model.Users;

public class AppUser {
	
	private int user_guid;	 //
	private String name;    //
	private int	height;    //
	private int	weight;    //
	private int	sex;    //
	private int	age;    //
	private int	sport_type;    //
	private int	shape_type;    //
	private String uri_pic;
	private String birthday;    //
	private String area_code;    //
	private String area_name;    //	
	private String time_zone;    //
	private String salt;    //
	
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSport_type() {
		return sport_type;
	}
	public void setSport_type(int sport_type) {
		this.sport_type = sport_type;
	}
	public int getShape_type() {
		return shape_type;
	}
	public void setShape_type(int shape_type) {
		this.shape_type = shape_type;
	}
	public String getUri_pic() {
		return uri_pic;
	}
	public void setUri_pic(String uri_pic) {
		this.uri_pic = uri_pic;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getArea_code() {
		return area_code;
	}
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public AppUser() {
		super();
	}
	 
	public AppUser loadAppUser(Users uInfo){
		AppUser au = new AppUser();
		au.setUser_guid(uInfo.getUser_guid());
		au.setName(uInfo.getName());
		au.setHeight(uInfo.getHeight());
		au.setWeight(uInfo.getWeight());
		au.setSex(uInfo.getSex());
		au.setAge(uInfo.getAge());
		au.setSport_type(uInfo.getSport_type());
		au.setShape_type(uInfo.getShape_type());
		au.setUri_pic(uInfo.getUri_pic());
		au.setBirthday(uInfo.getBirthday());
		au.setArea_code(uInfo.getArea_code());
		au.setArea_name(uInfo.getArea_name());
		au.setTime_zone(uInfo.getTime_zone());
		return au;
	}

}
