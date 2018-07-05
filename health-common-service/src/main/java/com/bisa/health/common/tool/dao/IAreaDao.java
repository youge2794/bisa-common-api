package com.bisa.health.common.tool.dao;

import java.util.List;

import com.bisa.appweb.model.Area;

public interface IAreaDao {
	
	public List<Area> getAreaList();
	
	public Area getAreaByCode(String area_code);

	public Area getAreaByAreaName(String area_name);

	public Area getAreaByPhoneCode(String selectpicker);
	
}
