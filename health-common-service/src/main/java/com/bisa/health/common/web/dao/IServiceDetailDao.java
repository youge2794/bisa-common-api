package com.bisa.health.common.web.dao;

import java.util.List;
import com.bisa.health.app.enumerate.ServiceType;
import com.bisa.health.app.model.ServiceDetail;

public interface IServiceDetailDao {
	
	public int saveAndUpServiceDetail(ServiceDetail serviceDetail);
	
	public List<ServiceDetail> lsitByUserguid(int userGuid);
	
	public List<ServiceDetail> listByUserguidAndCategory(int userGuid, ServiceType serviceType);

	public int updateServiceDetail(ServiceDetail serviceDetail, int version);
	
	
}
