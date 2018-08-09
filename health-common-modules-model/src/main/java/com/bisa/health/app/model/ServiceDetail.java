package com.bisa.health.app.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.bisa.health.app.enumerate.ServiceType;

@Entity
@Table(name="e_service_detail",indexes={@Index(columnList="user_guid")})
public class ServiceDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8620973614906844066L;

	private int id;
	
	private int user_guid;
	
	private ServiceType service_type;  //服务类型 0为计数 1为计时
		
	private Date finished_time;
	
	private int is_active;//是否有效（1-有效,；2-无效）
	
	private int count; //剩余次数
	
	private int product_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public Date getFinished_time() {
		
		return finished_time;
	}

	public void setFinished_time(Date finished_time) {
		this.finished_time = finished_time;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	
	
	@Enumerated(EnumType.ORDINAL)
	public ServiceType getService_type() {
		return service_type;
	}

	public void setService_type(ServiceType service_type) {
		this.service_type = service_type;
	}

	public ServiceDetail() {
		super();
	}

	public ServiceDetail(int user_guid, ServiceType service_type, Date finished_time, int is_active, int count) {
		super();
		this.user_guid = user_guid;
		this.service_type = service_type;
		this.finished_time = finished_time;
		this.is_active = is_active;
		this.count = count;
	}

	@Override
	public String toString() {
		return "ServiceDetail [id=" + id + ", user_guid=" + user_guid + ", service_type=" + service_type
				+ ", finished_time=" + finished_time + ", is_active=" + is_active + ", count=" + count + ", product_id="
				+ product_id + "]";
	}



	

	


}
