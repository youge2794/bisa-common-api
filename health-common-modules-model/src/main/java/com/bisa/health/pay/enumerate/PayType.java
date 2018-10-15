package com.bisa.health.pay.enumerate;

/**
 * 支付类型
 */
public enum PayType {

    wechat(1, "WECHAT"), // 微信支付
    alipay(2, "ALIPAY"), // 支付宝支付
    easy_link(3, "EASY_LINK"), // 银联
    visa(4, "VISA"); // visa

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
