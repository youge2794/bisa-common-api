package com.bisa.health.common.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bisa.health.common.dao.IUserRoleDao;
import com.bisa.health.model.UserRole;
import com.bisa.health.routing.annotation.RoutingTab;
import com.bisa.health.routing.annotation.TableEnum;

@Service
@RoutingTab(value=TableEnum.MASTER)
public class UserRoleService implements IUserRoleService{

	@Autowired
	private IUserRoleDao userRoleDao;

	@Override
	@Cacheable(value="spring-defaultCache",key="'user_role_'+#username")
	public List<UserRole> listRole(String username) {
		return userRoleDao.listRole(username);
	}

	public Set<String> listRoleStr(String username) {
		List<UserRole> list=listRole(username);;
		Set<String> roleStrs=new HashSet<String>();
		for(UserRole ur:list){
			roleStrs.add(ur.getName());
		}
		
		return roleStrs;
	}

	@Override
	public boolean addRole(UserRole userRole) {
		return userRoleDao.addRole(userRole);
	}
	
	


}
