package com.bisa.appweb.dto;

import com.bisa.health.model.UserAuths;
import com.bisa.health.model.Users;
/**
 * 从注解获得账号信息的封装类（很重要的类）
 * @author Administrator
 *
 */
public class UserInfoDto {
	
	private UserAuths userAuths;
	
	private Users users;
	

	public UserAuths getUserAuths() {
		return userAuths;
	}

	public void setUserAuths(UserAuths userAuths) {
		this.userAuths = userAuths;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
}
