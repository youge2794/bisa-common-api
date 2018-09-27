package com.bisa.health.common.web.dao;

import java.util.List;

import com.bisa.health.app.model.ServiceCategory;

public interface IServiceCategoryDao  {
	public int delete(ServiceCategory category);
	public int saveAndUpdate(ServiceCategory category);
	public List<ServiceCategory> listServiceCategory();
}
