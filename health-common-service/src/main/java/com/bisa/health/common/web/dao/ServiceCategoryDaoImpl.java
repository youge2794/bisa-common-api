package com.bisa.health.common.web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bisa.health.app.model.ServiceCategory;
import com.bisa.health.basic.dao.BaseDao;

@Repository
public class ServiceCategoryDaoImpl extends BaseDao<ServiceCategory> implements IServiceCategoryDao {

	@Override
	public int delete(ServiceCategory category) {
		this.delete(category.getId());
		return 1;
	}

	@Override
	public int saveAndUpdate(ServiceCategory category) {
		this.getSession().saveOrUpdate(category);
		return 1;
	}

	@Override
	public List<ServiceCategory> listServiceCategory() {
		String sql="SELECT * FROM e_service_category";
		return super.listBySql(sql, ServiceCategory.class, true);
	}

}
