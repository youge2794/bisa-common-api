package com.bisa.health.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_user_auths")
public class UserAuths implements Serializable {
	
	
	private static final long serialVersionUID = -4153599885114012823L;
	
	private int id;
	/**
	 * 用户id
	 */
	private int user_guid;
	/**
	 * 登入类型 
	 */
	private int l_type;
	
	/**
	 * 账号
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 是否验证了手机或者邮箱以二进制进行计算
	 * 比如验证了手机就是 0000 0001 10进制1
	 * 验证了邮箱就是 0000 0010		10进制2
	 * 手机和邮箱都验证就是 0000 0011 10进制3
	 * 以此类推
	 */
	private int verified;
	

	/**
	 * 角色
	 * @return
	 */
	private int role_id;
	
	/**
	 * 密码加盐
	 */
	private String salt;

	/**
	 * 用户状态
	 */
	private int archived;
	
	/**
	 * 创建时间
	 */
	private String create_time;
	
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

	public int getL_type() {
		return l_type;
	}

	public void setL_type(int l_type) {
		this.l_type = l_type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getVerified() {
		return verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public int getArchived() {
		return archived;
	}

	public void setArchived(int archived) {
		this.archived = archived;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}


	
	
}
