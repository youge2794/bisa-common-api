package com.bisa.health.common.service;

import java.util.List;

import com.bisa.health.model.UserAuths;



public interface IUserAuthsService {
	
	public UserAuths getUserAuthsByUsername(String username);
	
	public List<UserAuths> getUserAuthsByGuid(int user_guid);
	
	public boolean addUserAuths(UserAuths userAuths);
	
	public boolean updateUserAuths(UserAuths userAuths);
	
	public boolean updatePwd(int user_guid,String password);

	public boolean deleteUserAuths(String username);

	public boolean updateVerified(int user_guid, int value);

	public boolean addUserAuths(int user_guid,String username,String password, int l_type,int verified);

	
}
