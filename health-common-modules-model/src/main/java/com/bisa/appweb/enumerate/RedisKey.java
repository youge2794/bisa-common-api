package com.bisa.appweb.enumerate;

public enum RedisKey {
	
	REGISTER_CODE("sms_", "REGISTER_CODE"),
	LOGIN_CODE("sms_", "LOGIN_CODE"),
	BIND_PHONE_CODE("sms_", "BIND_PHONE_CODE"),
	BIND_EMAIL_CODE("bind_email_", "BIND_EMAIL_CODE"), 
	VARIFY("varify_","VARIFY");
	
	private String value;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private RedisKey(String value, String name) {
		this.value = value;
		this.name = name;
	}

	public static RedisKey getByValue(String value) {
		for (RedisKey status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
