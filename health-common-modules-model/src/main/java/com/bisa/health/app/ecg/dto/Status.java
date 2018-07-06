package com.bisa.health.app.ecg.dto;

public class Status {
	
	private int code;
	
	private String msg;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Status() {
		super();
	}
	public Status(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	

}
