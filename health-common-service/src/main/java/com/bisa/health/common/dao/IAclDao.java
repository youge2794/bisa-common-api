package com.bisa.health.common.dao;


import java.util.Set;


public interface IAclDao{

	
	/**
	 * 获取用户的权限字符串
	 * 权限字符串如: 资源标识:操作位:实例ID
	 * @param userId
	 * @param rtype
	 * @return
	 */
	public Set<String> listAllUserPermission(Integer userId,String rtype);
	
	
}
