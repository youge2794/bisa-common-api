package com.bisa.health.common.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.app.model.ServiceCategory;
import com.bisa.health.common.web.dao.IServiceCategoryDao;

@Service
public class ServiceCategoryServiceImpl implements IServiceCategoryService {

    @Autowired
    private IServiceCategoryDao categoryDao;

    @Override
    public ServiceCategory delete(ServiceCategory category) {
        categoryDao.delete(category);
        return category;
    }

    @Override
    public ServiceCategory saveAndUpdate(ServiceCategory category) {
        categoryDao.saveAndUpdate(category);
        return category;
    }

    @Override
    public List<ServiceCategory> listServiceCategory() {
        return categoryDao.listServiceCategory();
    }

}
