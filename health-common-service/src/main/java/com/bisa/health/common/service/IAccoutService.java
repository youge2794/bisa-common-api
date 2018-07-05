package com.bisa.health.common.service;

import com.bisa.health.model.UserAuths;
import com.bisa.health.model.UserRole;
import com.bisa.health.model.Users;

public interface IAccoutService {
	public boolean addAccout(Users users, UserRole[] userRole,UserAuths[] userAuths);
}
