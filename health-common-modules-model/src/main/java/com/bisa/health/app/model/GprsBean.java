package com.bisa.health.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="e_gprs")
public class GprsBean {
	private int id;
	private int user_guid;
	private String lng;
	private String lat;
	private String collection_time;
	private int gprs_type;
	private String address;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_guid() {
		return user_guid;
	}
	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getCollection_time() {
		return collection_time;
	}
	public void setCollection_time(String collection_time) {
		this.collection_time = collection_time;
	}
	public int getGprs_type() {
		return gprs_type;
	}
	public void setGprs_type(int gprs_type) {
		this.gprs_type = gprs_type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}