package com.bisa.health.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.bisa.health.common.dao.IUsersDao;
import com.bisa.health.model.Users;
import com.bisa.health.routing.annotation.RoutingTab;
import com.bisa.health.routing.annotation.TableEnum;
@Service
@RoutingTab(value=TableEnum.MASTER)
public class UsersServiceImpl implements IUsersService {
	
	@Autowired
	private IUsersDao iUsersDao;

	@Override
	@Cacheable(value="spring-defaultCache",key="'users_'+#user_guid")
	public Users getUsersByGuid(int user_guid) {
		return iUsersDao.getUsersByGuid(user_guid);
	}

	@Override
	@CacheEvict(value="spring-defaultCache",key="'users_'+#users.user_guid")
	public boolean updateUsers(Users users) {
		int result = iUsersDao.updateUsers(users);
		return result>=1?true:false;
	}

	@Override
	public boolean addUsersBasic(Users users) {
		int result = iUsersDao.addUsersBasic(users);
		return result>=1?true:false;
	}

	@Override
	@CacheEvict(value="spring-defaultCache",key="'users_'+#user_guid")
	public boolean deleteUsers(int user_guid) {
		int result = iUsersDao.deleteUsers(user_guid);
		return result>=1?true:false;
	}

	@Override
	@CacheEvict(value="spring-defaultCache",key="'users_'+#users.user_guid")
	public boolean updateUsersBasic(Users users) {
		int result = iUsersDao.updateUsersBasic(users);
		return result>=1?true:false;
	}

	@Override
	public boolean addUsers(Users users) {
		int result = iUsersDao.addUsers(users);
		return result>=1?true:false;
	}
	
	public boolean addUsers(int user_guid,String area_name,String area_code,String time_zone,int activate){
		Users users = new Users();
		users.setUser_guid(user_guid);
		users.setArea_name(area_name);
		users.setArea_code(area_code);
		users.setTime_zone(time_zone);
		users.setActivate(activate);
		return addUsers(users);
	}

}
