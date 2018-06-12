package com.bisa.helath.pay.enumerate;

/**
 * 交易状态
 * @author Administrator
 *
 */
public enum TradeStatus {
	
	/**
	 * 未支付
	 */
	UNPAID(10, "UNPAID"), 
	/**
	 * 已支付
	 */
	PAID(20, "PAID"),   
	/**
	 * 配货
	 */
	DISTRIBUTION(21, "DISTRIBUTION"),
	/**
	 * 出库  发货
	 */
	SHIPPED(22, "SHIPPED"), 
	 /**
	  * 已收货
	  */
	RECEIVED(30, "RECEIVED"), 
	/**
	 * 已关闭
	 */
	CLOSED(50, "CLOSED");  
	
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
	
	private TradeStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static TradeStatus getByValue(int value) {
		for (TradeStatus status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
