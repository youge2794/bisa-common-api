package com.bisa.health.common.web.service;

import java.util.List;

import com.bisa.health.app.model.ServiceCategory;

public interface IServiceCategoryService {
	public ServiceCategory delete(ServiceCategory category);
	public ServiceCategory saveAndUpdate(ServiceCategory category);
	public List<ServiceCategory> lsit();
}
