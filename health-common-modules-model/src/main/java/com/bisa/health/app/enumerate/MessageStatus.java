package com.bisa.health.app.enumerate;


public enum MessageStatus {
	
	UNPUSH(1,"UNPUSH"),
	PUSH(2,"PUSH"),
	UNREAD(3, "UNREAD"),
	READ(4, "READ");
	
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
	private MessageStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static MessageStatus getByValue(int value){
		for(MessageStatus ms : values()){
			if(ms.getValue() == value){
				return ms;
			}
		}
		return null;
	}
}
