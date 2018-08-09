package com.bisa.health.shop.enumerate;

/**
 * 售后处理状态
 * @author Administrator
 *
 */
public enum AfterSalesStatus {
	/**
	 * 订单未完成
	 */
	unable(0, "unable"),
	/**
	 * 待服务
	 */
	able(1, "able"),
	/**
	 * 服务中
	 */
	in_service(2, "in_service"),
	/**
	 * 已完成 
	 */
	completed(4, "completed"),
	/**
	 * 已取消
	 */
	cancelled(5, "cancelled"),
	/**
	 * 已关闭
	 */
	closed(6, "closed");

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

	private AfterSalesStatus(int value, String name) {
		this.value = value;
		this.name = name;
	}

	public static AfterSalesStatus getByValue(int value) {
		for (AfterSalesStatus status : values()) {
			if (status.getValue() == value) {
				return status;
			}
		}
		return null;
	}
}
