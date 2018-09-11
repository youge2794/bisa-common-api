package com.bisa.health.app.enumerate;

public enum ServiceType {
	
	COUNT(4, "COUNT"),
	TIMING(5, "TIMING");
	
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

	private ServiceType(int value) {  
        this.setValue(value);  
    }  
	
    private ServiceType() {
	}

	private ServiceType(int value, String name) {
		this.value = value;
		this.name = name;
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
