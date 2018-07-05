package com.bisa.health.common.dao;

import java.util.List;

import com.bisa.health.model.UserAuths;

public interface IUserAuthsDao {
	
	public UserAuths getUserAuthsByUsername(String username);
	
	public List<UserAuths> getUserAuthsByGuid(int user_guid);
	
	public int addUserAuths(UserAuths userAuths);
	
	public int updateUserAuths(UserAuths userAuths);
	
	public int updatePwd(int user_guid,String password);

	public int deleteUserAuths(String username);

	public UserAuths getUserAuthsByType(int user_guid, int l_type);

	public int updateVerified(int user_guid, int value);


}
