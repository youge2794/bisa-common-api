package com.bisa.health.common.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.bisa.health.common.dao.IAclDao;
import com.bisa.health.routing.annotation.RoutingTab;
import com.bisa.health.routing.annotation.TableEnum;

@Service
@RoutingTab(value=TableEnum.MASTER)
public class AclService implements IAclService{
	
	@Autowired
	private IAclDao aclDao;

	
	@Override
	@Cacheable(value="spring-defaultCache",key="'acl_'+#userId")
	public Set<String> listAllUserPermission(Integer userId, String rtype) {
		return aclDao.listAllUserPermission(userId, rtype);
	}

}
