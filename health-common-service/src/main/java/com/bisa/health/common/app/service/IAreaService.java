package com.bisa.health.common.app.service;

import java.util.List;

import com.bisa.health.app.model.Area;


public interface IAreaService {

	public List<Area> getAreaList();
	
	public Area getAreaByCode(String area_code);
	
	public Area getAreaByAreaName(String area_name);

	public Area getAreaByPhoneCode(String selectpicker);
}
