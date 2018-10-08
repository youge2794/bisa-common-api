package com.bisa.health.pay.enumerate;

/**
 * 支付状态
 * 
 * @author Administrator 交易状态( 0:关闭订单 1：未支付，2：待发货，3：待收货 4:待评价 5：待追评 6 追评完成  7 退款成功  8 退款失败)
 */
public enum PayStatus {

	/**
	 * 关闭订单
	 */
	close(0, "CLOSE"),
	/**
	 * 待支付（未支付）
	 */
	unpaid(1, "UNPAID"),
	/**
	 * 已支付（待发货）
	 */
	paid(2, "PAID"),
	/**
	 * 待收货（已发货）
	 */
	waitDelivery(3, "WAITDELIVERY"),
	/**
	 * 已收货（待评价）
	 */
	received(4, "RECEIVED"),
	/**
	 * 待追评(已评价)
	 */
	appraise_one(5, "APPRAISE_ONE"),
	/**
	 * (已评价)
	 */
	appraise_two(6, "APPRAISE_TWO"),
	/**
	 * 退款成功
	 */
	refund(7, "REFUND"),
	/**
	 * 退款失败
	 */
	refund_failure(8, "REFUND_FAILURE"),
	/**
	 * 等待退款
	 */
	refunding(9, "refunding");

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
