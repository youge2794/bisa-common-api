package com.bisa.health.common.tool.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.appweb.model.Area;
import com.bisa.health.basic.dao.BaseDao;
@Repository
public class AreaDaoImpl extends BaseDao<Area> implements IAreaDao {

	@Override
	public List<Area> getAreaList() {
		String sql = "select * from e_area";
		return super.listBySql(sql, null, Area.class);
	}

	@Override
	public Area getAreaByCode(String area_code) {
		String sql = "select * from e_area where area_code=?";
		return super.queryObjectBySql(sql, new Object[]{area_code}, Area.class);
	}

	@Override
	public Area getAreaByAreaName(String area_name) {
		String sql = "SELECT * FROM e_area WHERE AREA_NAME=?";
		return super.queryObjectBySql(sql, new Object[]{area_name}, Area.class);
	}

	@Override
	public Area getAreaByPhoneCode(String selectpicker) {
		String sql = "SELECT * FROM e_area WHERE PHONE_CODE=?";
		return super.queryObjectBySql(sql, new Object[]{selectpicker}, Area.class);
	}
	
}
