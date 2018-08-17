package com.bisa.health.app.enumerate;

public enum ServiceType {
	
	COUNT(4),
	TIMING(5);
	
    private int value;  

    public int getValue() {  
        return value;  
    }  

    public void setValue(int value) {  
        this.value = value;  
    }  

    private ServiceType(int value) {  
        this.setValue(value);  
    }  
    
    public static ServiceType getByValue(int value) {  
        for (ServiceType serviceType : values()) {  
            if (serviceType.getValue() == value) {  
                return serviceType;  
            }  
        }  
        return null;  
    }  
}  
