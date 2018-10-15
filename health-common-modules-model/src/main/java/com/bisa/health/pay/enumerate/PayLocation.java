package com.bisa.health.pay.enumerate;

/**
 * 交易地址
 * 1 电脑网页端  2 安卓手机 3 ios手机 4 电脑客户端
 */

public enum PayLocation {

    web(1, "web"),
    android(2, "android"),
    ios(3, "ios"),
    pc(4, "pc");

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

    private PayLocation(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static PayLocation getByValue(int value) {
        for (PayLocation status : values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        return null;
    }

}
