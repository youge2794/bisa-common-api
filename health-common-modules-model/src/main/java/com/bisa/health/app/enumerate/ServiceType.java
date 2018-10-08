package com.bisa.health.app.enumerate;

public enum ServiceType {
	
	COUNT("COUNT"),
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
