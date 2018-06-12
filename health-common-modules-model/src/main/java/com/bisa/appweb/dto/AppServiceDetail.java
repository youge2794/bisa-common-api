package com.bisa.appweb.dto;

import com.bisa.appweb.model.ServiceDetail;

public class AppServiceDetail {
	
	private int id;
	
	private String service_name;
	
	private String service_guid;
	
	private int service_type;  //9-悉心铃 ；10-15分钟报告；11-24小时报告；
		
	private String finished_time;//到期时间
	
	private int is_active;//是否有效（1-有效；2-无效）
	
	private int service_count;//剩余次数
	
	private int user_guid;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
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
	public String getFinished_time() {
		return finished_time;
	}

	public void setFinished_time(String finished_time) {
		this.finished_time = finished_time;
	}
	
	public int getService_count() {
		return service_count;
	}

	public void setService_count(int service_count) {
		this.service_count = service_count;
	}
	
	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	
	public int getUser_guid() {
		return user_guid;
	}

	public void setUser_guid(int user_guid) {
		this.user_guid = user_guid;
	}

	public AppServiceDetail() {
		super();
	}



	public AppServiceDetail(int id, String service_name, String service_guid, int service_type, String finished_time,
			int is_active, int service_count, int user_guid) {
		super();
		this.id = id;
		this.service_name = service_name;
		this.service_guid = service_guid;
		this.service_type = service_type;
		this.finished_time = finished_time;
		this.is_active = is_active;
		this.service_count = service_count;
		this.user_guid = user_guid;
	}

	public AppServiceDetail transferService(ServiceDetail sd){
		AppServiceDetail asd = new AppServiceDetail();
		asd.setId(sd.getId());
		asd.setFinished_time(sd.getFinished_time());
		asd.setService_count(sd.getCount());
		asd.setService_guid(sd.getService_guid());
		asd.setService_type(sd.getService_type());
		asd.setService_name(sd.getService_name());
		asd.setIs_active(sd.getIs_active());
		asd.setUser_guid(sd.getUser_guid());
		return asd;
	}

}
