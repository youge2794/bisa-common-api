package com.bisa.health.app.enumerate;


public enum LoginType {
	 PHONE(1,"PHONE"),
	 WECHAT(2,"WECHAT"),
	 EMAIL(3,"EMAIL"),
	 WEIBO(4,"WEIBO");
	    
	 private int value;
	 private String name;
	 
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private LoginType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	 
	public static LoginType getByValue(int value){
	      for (LoginType loginType : values()) {  
	            if (loginType.getValue() == value) {  
	                return loginType;  
	            }  
	        }  
	        return null;  
	}
	 
}
