package com.bisa.health.common.web.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.app.enumerate.ServiceType;
import com.bisa.health.app.model.ServiceDetail;
import com.bisa.health.common.web.dao.IServiceDetailDao;

@Service
public class ServiceDetailServiceImpl implements IServiceDetailService {
	
	@Autowired
	private IServiceDetailDao serviceDetailDao;

	@Override
	public ServiceDetail saveAndUpServiceDetail(ServiceDetail serviceDetail) {
		serviceDetailDao.saveAndUpServiceDetail(serviceDetail);
		return serviceDetail;
	}

	@Override
	public List<ServiceDetail> lsitByUserguid(int userGuid) {
		return serviceDetailDao.lsitByUserguid(userGuid);
	}

	@Override
	public List<ServiceDetail> listByUserguidAndCategory(int userGuid, ServiceType serviceType) {
		return serviceDetailDao.listByUserguidAndCategory(userGuid, serviceType);
	}

	

}
