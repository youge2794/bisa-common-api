package com.bisa.appweb.dto;

public class SystemInfo {
	/**
	 * 服务地址
	 */
	private String domain;
	/**
	 * 数据上传地址
	 */
	private String serverip;
	/**
	 * 登入时间GMT
	 */
	private Long loginTime;
	/**
	 * 过期时间GMT
	 */
	private Long expirationTime;
	/**
	 * 用户名
	 */
	private String username;
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getServerip() {
		return serverip;
	}
	public void setServerip(String serverip) {
		this.serverip = serverip;
	}
	public Long getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Long loginTime) {
		this.loginTime = loginTime;
	}
	public Long getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Long expirationTime) {
		this.expirationTime = expirationTime;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public SystemInfo() {
		super();
	}
	
}
