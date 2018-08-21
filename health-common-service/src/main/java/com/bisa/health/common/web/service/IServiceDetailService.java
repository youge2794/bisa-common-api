package com.bisa.health.common.web.service;

import com.bisa.health.app.model.ServiceDetail;

public interface IServiceDetailService {
	
	/**
	 * 根据类别和用户id获得服务细节
	 */
	public ServiceDetail selectServiceDetailByGuidAndClassifyId(int userGuid, int classifyId, int serviceType);

	public boolean addUpdateServiceDetail(ServiceDetail serviceDetail, int userGuid, Integer cardType, int classifyId, int count);
	
}
