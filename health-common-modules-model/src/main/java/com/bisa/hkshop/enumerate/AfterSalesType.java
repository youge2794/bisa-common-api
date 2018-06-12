package com.bisa.hkshop.enumerate;
/**
 * 售后服务类型
 * @author Administrator
 *
 */
public enum AfterSalesType {
	/**
	 * 换货
	 */
	EXCHANGE(1, "EXCHANGE"),  //换货
	/**
	 * 维修
	 */
	MAINTAIN(2, "MAINTAIN"),  // 维修
	/**
	 * 退款
	 */
	REFUND(3, "REFUND");  //退款

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
	
	private AfterSalesType(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static AfterSalesType getByValue(int value) {
		for (AfterSalesType status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}
}
