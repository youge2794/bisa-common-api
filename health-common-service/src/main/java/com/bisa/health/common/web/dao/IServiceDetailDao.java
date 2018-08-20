package com.bisa.health.common.web.dao;

import com.bisa.health.app.model.ServiceDetail;

public interface IServiceDetailDao {
	
	/**
	 * 根据类别和用户id获得服务细节
	 */
	public ServiceDetail selectServiceDetailByGuidAndClassifyId(int userGuid, int classifyId, int serviceType);

	public int addServiceDetail(ServiceDetail serviceDetail);
	
	public int updateServiceDetail(ServiceDetail serviceDetail, int version);
}
