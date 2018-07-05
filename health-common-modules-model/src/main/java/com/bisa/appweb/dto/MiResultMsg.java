package com.bisa.appweb.dto;

import java.io.Serializable;

public class MiResultMsg<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8654482165785326177L;
	

	private String token;
	
	private T data;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MiResultMsg(String token, T data) {
		super();
		this.token = token;
		this.data = data;
	}

	
	

}
