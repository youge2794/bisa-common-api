package com.bisa.health.common.web.dao;

import java.util.List;

import com.bisa.health.app.model.ServiceCategory;

/**
 * 服务状态表，关联的服务类型
 */
public interface IServiceCategoryDao {

    /**
     * 删除服务类型
     * @param category
     * @return
     */
    public int delete(ServiceCategory category);

    /**
     * 保存服务类型
     * @param category
     * @return
     */
    public int saveAndUpdate(ServiceCategory category);

    /**
     * 获取服务集合
     * @return
     */
    public List<ServiceCategory> listServiceCategory();
}
