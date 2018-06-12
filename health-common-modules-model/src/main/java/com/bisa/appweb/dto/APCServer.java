package com.bisa.appweb.dto;
import java.io.Serializable;

public class APCServer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5674813304197397731L;
	/**
	 * error code
	 */
	private int code;
	/**
	 * error msg
	 */
	private String message;
	/**
	 * 登入时间戳gmt时间
	 */
	private long timestamp;
	
	
	private Object data;

	
	private int user_guid;
	
	private String username;
	
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

	public int getUser_guid() {
		return user_guid;
	}

	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public APCServer(int code, String message, long timestamp, Object data, int user_guid, String username) {
		super();
		this.code = code;
		this.message = message;
		this.timestamp = timestamp;
		this.data = data;
		this.user_guid = user_guid;
		this.username = username;
	}

	public APCServer() {
		super();
	}
	

}
