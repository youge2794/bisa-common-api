package com.bisa.health.common.dao;


import java.util.List;
import org.springframework.stereotype.Repository;
import com.bisa.health.basic.dao.BaseDao;
import com.bisa.health.model.UserRole;


@Repository
public class UserRoleImpl extends BaseDao<UserRole> implements IUserRoleDao {

	@Override
	public List<UserRole> listRole(String username) {
		String sql = "select * from sys_roles username=?";
		return super.listBySql(sql, new Object[]{username}, UserRole.class);
	}

	@Override
	public boolean addRole(UserRole userRole) {
		return super.add(userRole)!=null?true:false;
	}


	

}
