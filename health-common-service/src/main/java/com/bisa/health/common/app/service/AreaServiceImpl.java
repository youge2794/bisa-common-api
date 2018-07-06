package com.bisa.health.common.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bisa.health.app.model.Area;
import com.bisa.health.common.app.dao.IAreaDao;
@Service
public class AreaServiceImpl implements IAreaService {
	
	@Autowired
	private IAreaDao iAreaDao;

	@Override
	@Cacheable(value="spring-defaultCache",key="'area_list'")
	public List<Area> getAreaList() {
		return iAreaDao.getAreaList();
	}
	
	@Override
	@Cacheable(value="spring-defaultCache",key="'area'+#area_code")
	public Area getAreaByCode(String area_code) {
		return iAreaDao.getAreaByCode(area_code);
	}

	@Override
	public Area getAreaByAreaName(String area_name) {
		return iAreaDao.getAreaByAreaName(area_name);
	}

	@Override
	public Area getAreaByPhoneCode(String selectpicker) {
		return iAreaDao.getAreaByPhoneCode(selectpicker);
	}

	
}
