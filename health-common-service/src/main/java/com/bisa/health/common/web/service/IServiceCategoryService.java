package com.bisa.health.common.web.service;

import java.util.List;

import com.bisa.health.app.model.ServiceCategory;

/**
 * 服务状态表，关联的服务类型
 */

public interface IServiceCategoryService {

	/**
	 * 删除服务类型
	 * @param category
	 * @return
	 */
	public ServiceCategory delete(ServiceCategory category);

	/**
	 * 保存服务类型
	 * @param category
	 * @return
	 */
	public ServiceCategory saveAndUpdate(ServiceCategory category);

	/**
	 * 获取服务集合
	 * @return
	 */
	public List<ServiceCategory> listServiceCategory();
}
