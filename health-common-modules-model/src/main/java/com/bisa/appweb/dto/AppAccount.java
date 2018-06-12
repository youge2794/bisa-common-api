package com.bisa.appweb.dto;

import java.util.List;

public class AppAccount {
	/**
	 * 错误状态
	 */
	private int code;
	/**
	 * 错误信息
	 */
	private String message;
	
	private List<AppUserDto> appUserDtoList;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<AppUserDto> getAppUserDtoList() {
		return appUserDtoList;
	}

	public void setAppUserDtoList(List<AppUserDto> appUserDtoList) {
		this.appUserDtoList = appUserDtoList;
	}

	public AppAccount() {
		super();
	}

	public AppAccount(int code, String message, List<AppUserDto> appUserDtoList) {
		super();
		this.code = code;
		this.message = message;
		this.appUserDtoList = appUserDtoList;
	}

	
}
