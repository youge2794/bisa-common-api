package com.bisa.appweb.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="e_service_detail",indexes={@Index(columnList="user_guid")})
public class ServiceDetail {
	
	private int id;
	
	private int user_guid;
	
	private String service_name;
	
	private String service_guid;
	
	private int service_type;  //9-悉心铃 ；10-15分钟报告；11-24小时报告；
		
	private String finished_time;
	
	private int is_active;//是否有效（1-有效,；2-无效）
	
	private int count; //剩余次数

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
	@Column(length=20,nullable=false)
	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	@Column(nullable=false,length=64)
	public String getService_guid() {
		return service_guid;
	}

	public void setService_guid(String service_guid) {
		this.service_guid = service_guid;
	}

	public int getService_type() {
		return service_type;
	}

	public void setService_type(int service_type) {
		this.service_type = service_type;
	}
	@Column(length=64)
	public String getFinished_time() {
		return finished_time;
	}

	public void setFinished_time(String finished_time) {
		this.finished_time = finished_time;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	@Column(nullable=false)
	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	public ServiceDetail() {
		super();
	}

	public ServiceDetail(int id, int user_guid, String service_name, String service_guid, int service_type,
			String finished_time, int is_active, int count) {
		super();
		this.id = id;
		this.user_guid = user_guid;
		this.service_name = service_name;
		this.service_guid = service_guid;
		this.service_type = service_type;
		this.finished_time = finished_time;
		this.is_active = is_active;
		this.count = count;
	}
}
