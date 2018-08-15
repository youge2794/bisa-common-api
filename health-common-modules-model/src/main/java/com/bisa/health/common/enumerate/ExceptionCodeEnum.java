package com.bisa.health.common.enumerate;

/**
 * @author Administrator
 *
 */
public enum ExceptionCodeEnum {
	
	SUCCESS("200", "执行成功"),
	NULL_PARAM("1001", "参数为空"),
	NOT_EXIST("1002", "不存在"),
	EXIST("1003", "已存在"),
	FAILURE("1004", "执行失败"),
	WRONG_CODE("1005", "验证码错误"),
	PAGE_EXPIRED("1006", "页面过期/表单重复提交"),
	WRONG_AREA("1007", "地区错误"),
	WRONG_USERNAME_PWD("1008", "用户名或密码错误"),
	ACCOUNT_LOCK("1009", "账号锁定"),
	UNKNOWN_MISTAKE("1010", "未知错误"),
	RETRY_FREQUENT("1011", "频繁登录，账号锁定");
	
	private String value;

	private String name;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private ExceptionCodeEnum(String value, String name) {
		this.value = value;
		this.name = name;
	}

	public static ExceptionCodeEnum getByValue(String value) {
		for (ExceptionCodeEnum status : values()) {
			if (status.getValue().equals(value)) {
				return status;
			}
		}
		return null;
	}

}
