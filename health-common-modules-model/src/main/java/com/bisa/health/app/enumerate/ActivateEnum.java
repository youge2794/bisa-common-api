package com.bisa.health.app.enumerate;

public enum ActivateEnum {
	INACTIVATED(0),ACTIVATE(1);
	private int value;

	private ActivateEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public static ActivateEnum getByValue(int value){
	      for (ActivateEnum auction : values()) {  
	            if (auction.getValue() == value) {  
	                return auction;  
	            }  
	        }  
	        return null;  
	}
}
