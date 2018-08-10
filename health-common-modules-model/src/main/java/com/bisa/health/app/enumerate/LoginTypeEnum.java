package com.bisa.health.app.enumerate;


public enum LoginTypeEnum{
	 PHONE(1),
	 WECHAT(2),
	 EMAIL(3),
	 WEIBO(4);
	    
	 private int value;
	 
	public int getValue() {
		return value;
	}
	
	
	private LoginTypeEnum(int value) {
		this.value = value;
	}
	public static LoginTypeEnum getByValue(int value){
	      for (LoginTypeEnum loginType : values()) {  
	            if (loginType.getValue() == value) {  
	                return loginType;  
	            }  
	        }  
	        return null;  
	}
	 
}
