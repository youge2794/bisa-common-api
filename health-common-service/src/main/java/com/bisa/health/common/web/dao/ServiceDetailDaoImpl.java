package com.bisa.health.common.web.dao;

import java.util.List;

import com.bisa.health.app.enumerate.ActivateEnum;
import org.springframework.stereotype.Repository;

import com.bisa.health.app.enumerate.ServiceType;
import com.bisa.health.app.model.ServiceDetail;
import com.bisa.health.basic.dao.BaseDao;


@Repository
public class ServiceDetailDaoImpl extends BaseDao<ServiceDetail> implements IServiceDetailDao {

    @Override
    public int saveAndUpServiceDetail(ServiceDetail serviceDetail) {
        this.getSession().saveOrUpdate(serviceDetail);
        return 1;
    }

    @Override
    public List<ServiceDetail> lsitByUserguid(int userGuid) {
        String sql = "SELECT * FROM e_service WHERE user_guid=?";
        return this.listBySql(sql, new Object[]{userGuid}, ServiceDetail.class);
    }

    @Override
    public List<ServiceDetail> listByUserguidAndCategory(int userGuid, ServiceType serviceType) {
        String sql = "SELECT * FROM e_service WHERE user_guid=? and service_type=?";
        return this.listBySql(sql, new Object[]{userGuid, serviceType}, ServiceDetail.class);
    }

    @Override
    public int updateServiceDetail(ServiceDetail serviceDetail, int version) {
        String sql = "UPDATE e_service SET finished_time=?, count=?, version=? where version=?";
        return super.updateBySql(sql, new Object[]{serviceDetail.getFinishedTime(), serviceDetail.getCount(), serviceDetail.getVersion(), version});
    }

    @Override
    public List<ServiceDetail> listByUserguidAndIsActive(int userGuid, int activateEnum) {
        String sql = "SELECT * FROM e_service WHERE user_guid = ? and is_active = ?";
        return this.listBySql(sql, new Object[]{userGuid, activateEnum}, ServiceDetail.class);
    }

}
