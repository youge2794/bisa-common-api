package com.bisa.health.shop.enumerate;


/**
 * 保修状态
 * @author Administrator
 */
public enum WarrantyStatus {

    //保修状态（10：无保修    20:未激活   30:保修中   40:已过期）
    NO_GUARANTEE(10, "NO_GUARANTEE"),
    NOT_ACTIVATE(20, "NOT_ACTIVATE"),
    IN_GUARANTEE(30, "IN_GUARANTEE"),
    EXPIRE(40, "EXPIRE");

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

    private WarrantyStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static WarrantyStatus getByValue(int value) {
        for (WarrantyStatus status : values()) {
            if (status.getValue() == value) {
                return status;
            }
        }
        return null;
    }


}
