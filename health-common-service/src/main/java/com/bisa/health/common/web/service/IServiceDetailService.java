package com.bisa.health.common.web.service;

import java.util.List;

import com.bisa.health.app.enumerate.ServiceType;
import com.bisa.health.app.model.ServiceDetail;

public interface IServiceDetailService {
	
	//service带有乐观锁字段version，能否用这个hibernate 的 saveAndUp方法，需要再次确认！
	public ServiceDetail saveAndUpServiceDetail(ServiceDetail serviceDetail);
	
	public List<ServiceDetail> listByUserguid(int userGuid);
	
	public List<ServiceDetail> listByUserguidAndCategory(int userGuid, ServiceType serviceType);
	
	//为乐观锁而写的修改语句，若删除，涉及商城激活服务卡的操作。
	public boolean updateServiceDetail(ServiceDetail serviceDetail, int version);
}
