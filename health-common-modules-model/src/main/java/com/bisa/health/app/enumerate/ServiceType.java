package com.bisa.health.app.enumerate;


public enum ServiceType {
	
	COUNT(0,"COUNT"),
	TIMING(1,"TIMING");
	
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

    private ServiceType(int value, String name) {  
        this.setValue(value);  
        this.setName(name);  
    }  
    
    public static ServiceType getByValue(int value) {  
        for (ServiceType reportType : values()) {  
            if (reportType.getValue() == value) {  
                return reportType;  
            }  
        }  
        return null;  
    }  
}  
