package com.bisa.health.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.health.model.UserAuths;
import com.bisa.health.model.UserRole;
import com.bisa.health.model.Users;
import com.bisa.health.routing.annotation.RoutingTab;
import com.bisa.health.routing.annotation.TableEnum;

@Service
@RoutingTab(value=TableEnum.MASTER)
public class AccoutServiceImpl implements IAccoutService {
	
	
	@Autowired
	private IUserAuthsService userAuthsService;
	
	@Autowired
	private IUsersService userService;
	
	@Autowired
	private IUserRoleService userRoleService;

	@Override
	public boolean addAccout(Users users, UserRole[] userRole,UserAuths[] userAuths) {
		
		try{
			for(UserAuths uaUsers : userAuths){
				userAuthsService.addUserAuths(uaUsers);
			}
			for(UserRole ur : userRole){
				userRoleService.addRole(ur);
			}
			userService.addUsers(users);
		
			return true;
		}catch (Exception e) {
			return false;
		}
		
		

	}

}
