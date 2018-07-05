package com.bisa.health.common.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import com.bisa.health.common.dao.IUserAuthsDao;
import com.bisa.health.common.utils.DateUtils;
import com.bisa.health.model.UserAuths;
import com.bisa.health.model.Users;
import com.bisa.health.routing.annotation.*;

@Service
@RoutingTab(value=TableEnum.MASTER)
public class UserAuthsServiceImpl implements IUserAuthsService{
	
	@Autowired
	private IUserAuthsDao iUserAuthsDao;

	@Override
	@Cacheable(value="spring-defaultCache",key="'user_auths_'+#username")
	public UserAuths getUserAuthsByUsername(String username) {
		return iUserAuthsDao.getUserAuthsByUsername(username);
	}

	@Override
	@Cacheable(value="spring-defaultCache",key="'user_auths_'+#user_guid")
	public List<UserAuths> getUserAuthsByGuid(int user_guid) {
		return iUserAuthsDao.getUserAuthsByGuid(user_guid);
	}

	@Override
	public boolean addUserAuths(UserAuths userAuths) {
		int result = iUserAuthsDao.addUserAuths(userAuths);
		return result>=1?true:false;
	}

	@Override
	@Caching(evict = { @CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.username"),
			@CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.user_guid") })
	public boolean updateUserAuths(UserAuths userAuths) {
		int result = iUserAuthsDao.updateUserAuths(userAuths);
		return result>=1?true:false;
	}

	@Override
	@Caching(evict = { @CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.username"),
	@CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.user_guid") })
	public boolean updatePwd(int user_guid, String password) {
		int result = iUserAuthsDao.updatePwd(user_guid, password);
		return result>=1?true:false;
	}

	@Override
	@Caching(evict = { @CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.username"),
	@CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.user_guid") })
	public boolean deleteUserAuths(String username) {
		int result = iUserAuthsDao.deleteUserAuths(username);
		return result>=1?true:false;
	}


	@Override
	@Caching(evict = { @CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.username"),
	@CacheEvict(value="spring-defaultCache",key="'user_auths_'+#userAuths.user_guid") })
	public boolean updateVerified(int user_guid, int value) {
		int result = iUserAuthsDao.updateVerified(user_guid,value);
		return result>=1?true:false;
	}

	public boolean addUserAuths(int user_guid,String username,String password, int l_type,int verified){
		//服务器gmt标准格式时间
		String server_time = DateUtils.standardTime(DateUtils.getGMTtimeSeconds());
		
		UserAuths userAuths = new UserAuths();
		userAuths.setUser_guid(user_guid);
		userAuths.setL_type(l_type);
		userAuths.setUsername(username);
		userAuths.setPassword(password);
		userAuths.setVerified(verified);
		userAuths.setRole_id(0);//暂时没有用
		userAuths.setSalt(username);
		userAuths.setArchived(1);
		userAuths.setCreate_time(server_time);
		return addUserAuths(userAuths);
	}
	


}
