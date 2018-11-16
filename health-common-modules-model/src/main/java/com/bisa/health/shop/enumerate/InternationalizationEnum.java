package com.bisa.health.shop.enumerate;

/**
 * 国际化 类型语言
 * @author Administrator
 */

public enum InternationalizationEnum {

    /**
     * 中文简体
     */
    zh_CN(1, "zh_CN"),
    /**
     * 中文繁体
     */
    zh_HK(2, "zh_HK"),
    /**
     * 英文
     */
    en_US(3, "en_US");

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

    private InternationalizationEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static InternationalizationEnum getByValue(int value) {
        for (InternationalizationEnum status : values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        return null;
    }

}
