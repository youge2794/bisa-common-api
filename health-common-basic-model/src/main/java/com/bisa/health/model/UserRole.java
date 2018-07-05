package com.bisa.health.model;
/**
 * 用户和角色的关联表
 * @author Konghao
 *
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sys_user_role")
public class UserRole {
	private int id;
	private String username;
	private String name;
	private int status;
	private String sn;

	public static final String PRINCIPAL_TYPE="role";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	
	
	public UserRole() {
		super();
	}
	public UserRole(String username, String name) {
		super();
		this.username = username;
		this.name = name;
	}
	public UserRole(String username, String name, int status, String sn) {
		super();
		this.username = username;
		this.name = name;
		this.status = status;
		this.sn = sn;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", username=" + username + ", name=" + name + ", status=" + status + ", sn=" + sn
				+ "]";
	}
	
	
	
	
}