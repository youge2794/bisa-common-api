package com.bisa.health.shop.enumerate;


/**
 * 保修状态
 * @author Administrator
 *
 */
public enum GuaranteeStatus {

	IN_GUARENTEE(10, "IN_GUARENTEE"),  //保修期
	EXPIRE(20, "EXPIRE");    //超出保修期
	
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
	
	private GuaranteeStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static GuaranteeStatus getByValue(int value) {
		for (GuaranteeStatus status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}
	
}
