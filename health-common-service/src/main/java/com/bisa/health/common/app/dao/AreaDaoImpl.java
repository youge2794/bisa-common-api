package com.bisa.health.common.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.app.model.Server;
import com.bisa.health.basic.dao.BaseDao;
@Repository
public class AreaDaoImpl extends BaseDao<Server> implements IAreaDao {

	@Override
	public List<Server> getAreaList() {
		String sql = "select id,phoneCode,countryCode,country,en_country,time_zone,order_id from e_server order by order_id desc";
		return super.listBySql(sql, null, Server.class);
	}

	@Override
	public Server getAreaByCode(String area_code) {
		String sql = "select id,phoneCode,countryCode,country,en_country,time_zone,order_id from e_server where countryCode=?";
		return super.queryObjectBySql(sql, new Object[]{area_code}, Server.class);
	}


	@Override
	public Server getAreaByPhoneCode(String selectpicker) {
		String sql = "select id,phoneCode,countryCode,country,en_country,time_zone,order_id from e_server where phoneCode=?";
		return super.queryObjectBySql(sql, new Object[]{selectpicker}, Server.class);
	}
	
}
