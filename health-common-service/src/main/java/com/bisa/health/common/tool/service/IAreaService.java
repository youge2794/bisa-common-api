package com.bisa.health.common.tool.service;

import java.util.List;

import com.bisa.appweb.model.Area;

public interface IAreaService {

	public List<Area> getAreaList();
	
	public Area getAreaByCode(String area_code);
	
	public Area getAreaByAreaName(String area_name);

	public Area getAreaByPhoneCode(String selectpicker);
}
