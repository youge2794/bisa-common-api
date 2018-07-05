package com.bisa.health.common.dao;

import com.bisa.health.model.Users;

public interface IUsersDao {
	
	public Users getUsersByGuid(int user_guid);
	
	public int updateUsers(Users users);
	
	public int addUsersBasic(Users users);

	public int deleteUsers(int user_guid);

	public int updateUsersBasic(Users users);
	//在addUsersBasic基础上多加了昵称Name
	public int addUsers(Users users);
	
}
