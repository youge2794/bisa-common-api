package com.bisa.appweb.dto;
/**
 * 移动端
 * 手机号验证码
 * 生成地区信息的json文件
 * 
 * @author Administrator
 *
 */
public class AreaDto {
	
	private String phoneCode;
	private String countryCode;
	private String time_zone;
	private String country;
	
	public String getPhoneCode() {
		return phoneCode;
	}
	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
