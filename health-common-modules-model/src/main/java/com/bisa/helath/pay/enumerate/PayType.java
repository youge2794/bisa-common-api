package com.bisa.helath.pay.enumerate;

/**
 * 支付类型
 * @author Administrator
 *
 */
public enum PayType {
	
	WECHAT(1001, "WECHAT"),  //微信支付
	ALIPAY(1002, "ALIPAY"),  //支付宝支付
	EASY_LINK(1003, "EASY_LINK"),  //银联
	VISA(1004, "VISA"); //visa
	
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
	
	private PayType(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static PayType getByValue(int value) {
		for (PayType status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}

}
