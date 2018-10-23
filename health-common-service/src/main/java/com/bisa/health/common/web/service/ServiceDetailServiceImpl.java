package com.bisa.health.common.web.service;


import com.bisa.health.app.enumerate.ActivateEnum;
import com.bisa.health.app.enumerate.ServiceType;
import com.bisa.health.app.model.ServiceDetail;
import com.bisa.health.common.web.dao.IServiceDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<ServiceDetail> listByUserguid(int userGuid) {
        return serviceDetailDao.lsitByUserguid(userGuid);
    }

    @Override
    public List<ServiceDetail> listByUserguidAndIsActive(int userGuid, int activateEnum) {
        return serviceDetailDao.listByUserguidAndIsActive(userGuid, activateEnum);
    }

    @Override
    public List<ServiceDetail> listByUserguidAndCategory(int userGuid, ServiceType serviceType) {
        return serviceDetailDao.listByUserguidAndCategory(userGuid, serviceType);
    }

    @Override
    public boolean updateServiceDetail(ServiceDetail serviceDetail, int version) {
        int result = serviceDetailDao.updateServiceDetail(serviceDetail, version);
        return result >= 1 ? true : false;
    }
}
