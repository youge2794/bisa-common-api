package com.bisa.health.app.enumerate;


public enum MessageType{
	
	SERVICE(8,"SERVICE"),
	ALARM(9,"ALARM"),
	MINUTE15(10,"MINUTE15"),
	HOUR24(11,"HOUR24"), 
	MINUTE(12,"MINUTE");
	
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
	private MessageType(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static MessageType getByValue(int value){
		for(MessageType mt : values()){
			if(mt.getValue() == value){
				return mt;
			}
		}
		return null;
	}

}
