package com.bisa.health.app.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="e_server")
public class Server implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7996875574127828767L;

	private int id;
	
	private String phoneCode;// "971",电话区号
    
	private String countryCode;// "AE",国家缩写

    
	private String country;  //地区中文名
	
	private String en_country;  //地区英文名
    
    private String time_zone;

    //排序id
    private int order_id;


    
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
	
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}

	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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
