package com.bisa.appweb.enumerate;

public enum UsersActivate {
	
	INACTIVATED(0,"INACTIVATED"),
	ACTIVATE(1,"ACTIVATE");
	
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
	private UsersActivate(int value, String name) {
		this.value = value;
		this.name = name;
	}

}
