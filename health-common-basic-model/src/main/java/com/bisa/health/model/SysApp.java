package com.bisa.health.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="t_sys_app",uniqueConstraints={@UniqueConstraint(columnNames={"appKey"})})
public class SysApp {
	
	private Integer id;
	/**
	 *服务器的名字 
	 */
	private String name;
	/**
	 * 服务器ID
	 */
	private String appKey;
	/**
	 * 服务器的安全码
	 */
	private String appSecret;
	/**
	 * 是否可用
	 */
	private Boolean available=Boolean.FALSE;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	
	

}
