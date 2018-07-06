package com.bisa.health.shop.enumerate;


public enum AddressStatus {
	
	/**
	 * 有效
	 */
	VALID(10, "VALID"),
	/**
	 * 无效
	 */
	INVALID(20, "INVALID");
	
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
	
	private AddressStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static AddressStatus getByValue(int value) {
		for (AddressStatus status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}
}
