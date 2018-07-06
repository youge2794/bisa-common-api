package com.bisa.health.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="e_server")
public class Server {
	
	private int id;
	
	private String phoneCode;// "971",电话区号
    
	private String countryCode;// "AE",国家缩写
    /*
     * CN-中国
     * HK-亚洲 及韩国日本台湾香港等
     * EU-欧洲
     * US-美洲
     * ME-中东，非洲
     */
	private String continent;  //服务器五个大区缩写
    
	private String country;  //地区中文名
	
	private String en_country;  //地区英文名
	
	private String dataip;//"fe.data.bisahealth.com",//上传地址
    
	private String domain;//"fe.bisahealth.com"//服务器地址
    
    private String time_zone;
    /*
     * //该地区是否有服务器
     * 0-没开放
     * 1-开放（按该地区所属大区服务器分配）
     * 2-默认香港
     */
    private int status; 
    //排序id
    private int order_id;
    
    private String shopserver;

    
    @Id
   	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEn_country() {
		return en_country;
	}
	public void setEn_country(String en_country) {
		this.en_country = en_country;
	}
	public String getDataip() {
		return dataip;
	}
	public void setDataip(String dataip) {
		this.dataip = dataip;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public String getShopserver() {
		return shopserver;
	}
	public void setShopserver(String shopserver) {
		this.shopserver = shopserver;
	}
	public static Server getServer(List<Server> list,String code){
		if(code==null){
			return null;
		}
		Server _server=null;
		for(Server server : list){
			if(server.countryCode.equals(code)){
				_server=server;
				return _server;
			}
		}
		 return getServer(list,"HK");
	}

}
