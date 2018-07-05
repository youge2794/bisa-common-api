package com.bisa.appweb.dto;

import java.io.Serializable;

/**
 * 封装放回数据
 * @author Administrator
 *
 */
public class ResultPackage<T> implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6573119910965825659L;
	
	private int user_guid;
	
	private String token;
	
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	public int getUser_guid() {
		return user_guid;
	}

	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	

	public ResultPackage() {
		super();
		
	}

	

	public ResultPackage(int user_guid, String username, String token, T data) {
		super();
		this.user_guid = user_guid;
		this.username = username;
		this.token = token;
		this.data = data;
	}

	public ResultPackage(int user_guid, String username) {
		super();
		this.user_guid = user_guid;
		this.username = username;
	}
	
	public ResultPackage(int user_guid, String username, T data) {
		super();
		this.user_guid = user_guid;
		this.username = username;
		this.data = data;
	}

	public ResultPackage(int user_guid, String username, String token) {
		super();
		this.user_guid = user_guid;
		this.username = username;
		this.token = token;
	}

	@Override
	public String toString() {
		return "ResultPackage [user_guid=" + user_guid + ", token=" + token + ", username=" + username + ", data="
				+ data + "]";
	}
	

	
	
	
	
}
