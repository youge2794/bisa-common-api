package com.bisa.health.app.enumerate;

public enum RoleTypeEnum{
	ROLE_ADMIN("Admin"),ROLE_DOCTOR("Doctor"),ROLE_USER("User"),ROLE_CUSTOMER("Customer");
	private String value;

	private RoleTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static RoleTypeEnum getByValue(String value){
	      for (RoleTypeEnum roleType : values()) {  
	            if (roleType.getValue().equals(value.trim())) {  
	                return roleType;  
	            }  
	        }  
	        return null;  
	}
	
	
}
