package com.bisa.health.shop.enumerate;


/**
 * 售后处理状态
 * @author Administrator
 *
 */
public enum AfterSalesStatus {
	/**
	 * 待审核
	 */
	PENDING_REVIEW(10,"PENDING_REVIEW"),  
	/**
	 * 待寄回
	 */
	SEND_BACK(20, "SEND_BACK"),
	/**
	 * 服务中
	 */
	IN_SERVICE(21, "IN_SERVICE"),  
	/**
	 * 已完成 
	 */
	COMPLETED(30, "COMPLETED"),  
	/**
	 * 已取消
	 */
	CANCELLED(40, "CANCELLED"),
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
