package com.bisa.health.common.web.dao;

import org.springframework.stereotype.Repository;

import com.bisa.health.app.model.ServiceDetail;
import com.bisa.health.basic.dao.BaseDao;

@Repository
public class ServiceDetailDaoImpl extends BaseDao<ServiceDetail> implements IServiceDetailDao {

	@Override
	public ServiceDetail selectServiceDetailByGuidAndClassifyId(int userGuid, int classifyId, int serviceType) {
		String sql = "SELECT id, user_guid, service_type, finished_time, is_active, count, classify_id, version FROM e_service_detail WHERE user_guid = ? AND classify_id = ? AND service_type = ?";
		return super.queryObjectBySql(sql, new Object[]{userGuid, classifyId, serviceType}, ServiceDetail.class);
	}

	@Override
	public int addServiceDetail(ServiceDetail serviceDetail) {
		String sql = "INSERT INTO e_service_detail(user_guid, service_type, finished_time, is_active, count, classify_id, version)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
		return super.addBySql(sql, new Object[]{serviceDetail.getUserGuid(), serviceDetail.getServiceType(), serviceDetail.getFinishedTime(),
				serviceDetail.getIsActive(), serviceDetail.getCount(), serviceDetail.getClassifyId(), serviceDetail.getVersion()});
	}

	@Override
	public int updateServiceDetail(ServiceDetail serviceDetail, int version) {
		super.getSession().evict(serviceDetail);
		String sql = "UPDATE e_service_detail SET finished_time = ?, is_active = ?, count = ?, version = ? WHERE id = ? AND version = ?";
		return super.updateBySql(sql, new Object[]{serviceDetail.getFinishedTime(), serviceDetail.getIsActive(), serviceDetail.getCount(), serviceDetail.getVersion(), serviceDetail.getId(), version});
	}

}
