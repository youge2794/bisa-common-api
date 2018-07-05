package com.bisa.health.common.service;

import com.bisa.health.model.Users;

public interface IUsersService {
	
	
	public Users getUsersByGuid(int user_guid);
	
	public boolean updateUsers(Users users);
	
	public boolean addUsersBasic(Users users);
	
	public boolean addUsers(Users users);

	public boolean deleteUsers(int user_guid);

	public boolean updateUsersBasic(Users users);
	
	public boolean addUsers(int user_guid,String area_name,String area_code,String time_zone,int activate);

}
