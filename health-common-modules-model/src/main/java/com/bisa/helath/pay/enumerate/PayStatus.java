package com.bisa.helath.pay.enumerate;

/**
 * 支付状态
 * @author Administrator
 *
 */
public enum PayStatus {
	
	/**
	 * 无支付状态
	 */
	NONE(0, "NONE"), 
	/**
	 * 待支付
	 */
	UNPAID(1, "UNPAID"), 
	/**
	 * 已支付
	 */
	PAID(2, "PAID"), 
	/**
	 * 关闭订单 
	 */
	CLOSED(3, "CLOSED"), 
	/**
	 * 退款成功
	 */
	REFUND(4, "REFUND"),
	/**
	 * 退款失败
	 */
	REFUND_FAILURE(5, "REFUND_FAILURE"); 
	
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
	
	private PayStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static PayStatus getByValue(int value) {
		for (PayStatus status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}
	
}
