package com.bisa.health.common.dao;

import java.util.List;
import java.util.Set;

import com.bisa.health.model.UserRole;



public interface IUserRoleDao{
	public List<UserRole> listRole(String username);
	public boolean addRole(UserRole userRole);
}

