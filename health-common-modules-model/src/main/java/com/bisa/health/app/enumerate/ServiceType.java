package com.bisa.health.app.enumerate;

/**
 * 服务的类型
 */

public enum ServiceType {

    /**
     * 次数
     */
    COUNT("COUNT"),
    /**
     * 时限
     */
    TIMING("TIMING");

    private String value;

    private ServiceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static ServiceType getByValue(String value) {
        for (ServiceType roleType : values()) {
            if (roleType.getValue().equals(value.trim())) {
                return roleType;
            }
        }
        return null;
    }
}  
