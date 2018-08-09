package com.bisa.health.app.enumerate;


public enum ServiceType {
	
	COUNT(0),
	TIMING(1);
	
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
        for (ServiceType reportType : values()) {  
            if (reportType.getValue() == value) {  
                return reportType;  
            }  
        }  
        return null;  
    }  
}  
