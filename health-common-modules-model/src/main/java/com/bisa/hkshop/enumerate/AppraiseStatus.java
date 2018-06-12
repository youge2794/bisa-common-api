package com.bisa.hkshop.enumerate;

/**
 * 评价状态
 * 
 * @author Administrator
 *
 */
public enum AppraiseStatus {
	/**
	 * 未评价
	 */
	NotEvaluated(1, "NotEvaluated"),
	/**
	 * 已评价
	 */
	Evaluated(2, "Evaluated"),
	/**
	 * 已失效
	 */
	Invalid(3, "Invalid");

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

	private AppraiseStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static AppraiseStatus getByValue(int value) {
		for (AppraiseStatus status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
