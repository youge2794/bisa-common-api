package com.bisa.health.common.web.dao;

import java.util.List;

import com.bisa.health.app.enumerate.ActivateEnum;
import com.bisa.health.app.enumerate.ServiceType;
import com.bisa.health.app.model.ServiceDetail;

/**
 * 服务状态表
 */

public interface IServiceDetailDao {
    /**
     * service带有乐观锁字段version，能否用这个hibernate 的 saveAndUp方法，需要再次确认！
     * @param serviceDetail
     * @return
     */
    public int saveAndUpServiceDetail(ServiceDetail serviceDetail);

    /**
     * 根据用户的guid，获取用户激活的集合
     * @param userGuid
     * @return
     */
    public List<ServiceDetail> lsitByUserguid(int userGuid);

    /**
     * 根据用户的guid和服务类型，获取用户激活的集合
     * @param userGuid
     * @param serviceType
     * @return
     */
    public List<ServiceDetail> listByUserguidAndCategory(int userGuid, ServiceType serviceType);

    /**
     * 为乐观锁而写的修改语句，若删除，涉及商城激活服务卡的操作。
     * @param serviceDetail
     * @param version
     * @return
     */
    public int updateServiceDetail(ServiceDetail serviceDetail, int version);

    /**
     * 根据用户的guid和服务的状态，获取用户激活的集合
     * @param userGuid
     * @param activateEnum
     * @return
     */
    List<ServiceDetail> listByUserguidAndIsActive(int userGuid, int activateEnum);
}
