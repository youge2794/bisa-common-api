package com.bisa.health.app.enumerate;

public enum UsersVerified {
	
	INVERIFIED(0,"INVERIFIED"),
	VERIFIED(1,"VERIFIED");
	
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
	private UsersVerified(int value, String name) {
		this.value = value;
		this.name = name;
	}

}
