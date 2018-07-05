package com.bisa.health.model;

import java.io.Serializable;
import java.util.Date;

public class JwtPlayload implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1642800983901342525L;
	
	private String id;
	private String username;
	private String issuer;
	private Date issuedAt;
	private String audience;
	private String roles;
	private String perms;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public Date getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(Date issuedAt) {
		this.issuedAt = issuedAt;
	}
	public String getAudience() {
		return audience;
	}
	public void setAudience(String audience) {
		this.audience = audience;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getPerms() {
		return perms;
	}
	public void setPerms(String perms) {
		this.perms = perms;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
