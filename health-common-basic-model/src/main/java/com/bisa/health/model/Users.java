package com.bisa.health.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.bisa.health.basic.constant.MessageSource;

@Entity
@Table(name="sys_users")
public class Users implements Serializable{
	
	private static final long serialVersionUID = -4270156796596069231L;
	
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
	
	@NotBlank(message=MessageSource.ParamError)
	private String name;
	/**
	 * 用户性别
	 */
	@Range(message=MessageSource.ParamError,min=0,max=1)
	private int sex;
	/**
	 * 用户年龄
	 */
	@Range(message=MessageSource.ParamError,min=1,max=120)
	private int age;
	/**
	 * 用户体重
	 */
	@Range(message=MessageSource.ParamError,min=20,max=200)
	private int weight;
	/**
	 * 用户身高
	 */
	@Range(message=MessageSource.ParamError,min=80,max=250)
	private int height;
	/**
	 * 运动类型
	 */
	@Range(message=MessageSource.ParamError,min=1,max=3)
	private int sport_type;
	/**
	 * 用户体型
	 */
	@Range(message=MessageSource.ParamError,min=1,max=4)
	private int shape_type;

	/**
	 * 用户头像
	 */
	private String uri_pic;
	/**
	 * 用户生日
	 */
	@NotBlank(message=MessageSource.ParamError)
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

	public Users() {
		super();
	}

	public Users(int user_guid, String area_name, String area_code, String time_zone, int activate) {
		super();
		this.user_guid = user_guid;
		this.area_name = area_name;
		this.area_code = area_code;
		this.time_zone = time_zone;
		this.activate = activate;
	}

	
	public void mergeUsers(SysUser sysUser){
		this.activate=sysUser.getActivate();
		this.age=sysUser.getAge();
		this.area_code=sysUser.getArea_code();
		this.area_name=sysUser.getArea_name();
		this.birthday=sysUser.getBirthday();
		this.height=sysUser.getHeight();
		this.name=sysUser.getName();
		this.user_guid=sysUser.getUser_guid();
		this.sex=sysUser.getSex();
		this.shape_type=sysUser.getShape_type();
		this.sport_type=sysUser.getSport_type();
		this.time_zone=sysUser.getTime_zone();
		this.uri_pic=sysUser.getUri_pic();
		this.weight=sysUser.getWeight();
	}
	
	public Users mergeUsers(Users users){
		this.age=users.getAge();
		this.birthday=users.getBirthday();
		this.height=users.getHeight();
		this.name=users.getName();
		this.user_guid=users.getUser_guid();
		this.sex=users.getSex();
		this.shape_type=users.getShape_type();
		this.sport_type=users.getSport_type();
		this.weight=users.getWeight();
		return this;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", user_guid=" + user_guid + ", name=" + name + ", sex=" + sex + ", age=" + age
				+ ", weight=" + weight + ", height=" + height + ", sport_type=" + sport_type + ", shape_type="
				+ shape_type + ", uri_pic=" + uri_pic + ", birthday=" + birthday + ", area_name=" + area_name
				+ ", area_code=" + area_code + ", time_zone=" + time_zone + ", activate=" + activate + "]";
	}
	
	
	
	
	
}
