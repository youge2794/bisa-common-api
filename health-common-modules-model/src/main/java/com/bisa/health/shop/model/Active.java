package com.bisa.health.shop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;



@Entity
@Table(name="s_active",indexes={@Index(columnList="user_guid")})
public class Active {
	
	private int id;
	private int user_guid;   //服务器的用户id
	private String guid;        //用户的uuid
	private String active_code; //激活码
	private Date start_time;  //创建时间
	private Date active_time; //激活时间
	private Date active_life; //激活期限
	private int active_statu; //激活状态
	private String service_name; //服务名称
	private String service_guid; //服务的guid
	private int service_number; //购买服务的数量
	
	private String account;//激活账号
	
	@Id
	@GeneratedValue
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
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getActive_code() {
		return active_code;
	}
	public void setActive_code(String active_code) {
		this.active_code = active_code;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getActive_time() {
		return active_time;
	}
	public void setActive_time(Date active_time) {
		this.active_time = active_time;
	}
	public Date getActive_life() {
		return active_life;
	}
	public void setActive_life(Date active_life) {
		this.active_life = active_life;
	}
	public int getActive_statu() {
		return active_statu;
	}
	public void setActive_statu(int active_statu) {
		this.active_statu = active_statu;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getService_guid() {
		return service_guid;
	}
	public void setService_guid(String service_guid) {
		this.service_guid = service_guid;
	}
	public int getService_number() {
		return service_number;
	}
	public void setService_number(int service_number) {
		this.service_number = service_number;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	
}
