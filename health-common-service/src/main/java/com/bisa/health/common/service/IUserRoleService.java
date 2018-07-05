package com.bisa.health.common.service;


import java.util.List;
import java.util.Set;

import com.bisa.health.model.UserRole;

public interface IUserRoleService {
	public List<UserRole> listRole(String username);
	public Set<String> listRoleStr(String username);
	public boolean addRole(UserRole userRole);
}
