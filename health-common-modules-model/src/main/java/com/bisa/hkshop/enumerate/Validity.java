package com.bisa.hkshop.enumerate;

/**
 * 有效性
 * @author Administrator
 *
 */
public enum Validity {

	/**
	 * 有效
	 */
	VALID(1, "VALID"), 
	/**
	 * 无效
	 */
	INVALID(2, "INVALID"); 
	
	
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
	
	private Validity(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static Validity getByValue(int value) {
		for (Validity status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}

