package com.bisa.health.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_users")
public class Users implements Serializable{
	
	private static final long serialVersionUID = -4270156796596069231L;
	public static final String PRINCIPAL_TYPE="users";
	/**
	 * ID
	 */
	private int id;
	/**
	 * 用户guid
	 */
	private int user_guid;
	/**
	 * 用户名字
	 */
	private String name;
	/**
	 * 用户性别
	 */
	private int sex;
	/**
	 * 用户年龄
	 */
	private int age;
	/**
	 * 用户体重
	 */
	private int weight;
	/**
	 * 用户身高
	 */
	private int height;
	/**
	 * 运动类型
	 */
	private int sport_type;
	/**
	 * 用户体型
	 */
	private int shape_type;

	/**
	 * 用户头像
	 */
	private String uri_pic;
	/**
	 * 用户生日
	 */
	private String birthday;

	/**
	 * 地区名称
	 */
	private String area_name;
	/**
	 * 地区编码
	 */
	private String area_code;
	/**
	 *时区
	 */
	private String time_zone;
	/**
	 * 是否启用默认是0
	 */
	private int activate;

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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

	public int getActivate() {
		return activate;
	}

	public void setActivate(int activate) {
		this.activate = activate;
	}


	
	
	
}
