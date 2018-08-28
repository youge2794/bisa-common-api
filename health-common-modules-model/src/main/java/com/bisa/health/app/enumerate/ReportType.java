package com.bisa.health.app.enumerate;


public enum ReportType {
	
	ALARM(9),
	MINUTE15(10),
	HOUR24(11), 
	MINUTE(12);
	
    private int value;  

    public int getValue() {  
        return value;  
    }  

    public void setValue(int value) {  
        this.value = value;  
    }  


    private ReportType(int value) {  
        this.setValue(value);  
    }  
    
    public static ReportType getByValue(int value) {  
        for (ReportType reportType : values()) {  
            if (reportType.getValue() == value) {  
                return reportType;  
            }  
        }  
        return null;  
    }  
    
    
    
}  
