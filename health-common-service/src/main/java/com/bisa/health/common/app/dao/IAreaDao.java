package com.bisa.health.common.app.dao;

import java.util.List;
import com.bisa.health.app.model.Server;


public interface IAreaDao {
	
	public List<Server> getAreaList();
	
	public Server getAreaByCode(String area_code);

	public Server getAreaByPhoneCode(String selectpicker);
	
}
