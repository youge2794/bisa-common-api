package com.bisa.health.app.enumerate;
/**
 * 角色枚举类
 * @author Administrator
 *
 */
public enum RoleTypeEnum {
	/**
	 * 超级管理员
	 */
	ROLE_ADMIN("ROLE_ADMIN"),
	/**
	 * 用户
	 */
	ROLE_USER("ROLE_USER"),
	/**
	 * 客服
	 */
	ROLE_CUSTOMER("ROLE_CUSTOMER"),
	/**
	 * 仓库
	 */
	ROLE_STORE("ROLE_STORE"),
	/**
	 * 医生
	 */
	ROLE_DOCTOR("ROLE_DOCTOR");

	private String value;

	private RoleTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static RoleTypeEnum getByValue(String value) {
		for (RoleTypeEnum roleType : values()) {
			if (roleType.getValue().equals(value.trim())) {
				return roleType;
			}
		}
		return null;
	}

}
