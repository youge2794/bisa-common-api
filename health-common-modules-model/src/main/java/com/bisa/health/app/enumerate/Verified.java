package com.bisa.health.app.enumerate;


public enum Verified {
	
	PHONE(1,"PHONE"),
	MAIL(10,"MAIL"),
	BOTH_PHONE_MAIL(11,"BOTH_PHONE_MAIL");
	
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
	private Verified(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static Verified getByValue(int value){
		for(Verified verified : values()){
			if(verified.getValue() == value){
				return verified;
			}
		}
		return null;  
	}

}
