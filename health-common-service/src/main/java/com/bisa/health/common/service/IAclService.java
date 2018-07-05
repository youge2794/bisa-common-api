package com.bisa.health.common.service;

import java.util.Set;

public interface IAclService {
	
	public Set<String> listAllUserPermission(final Integer userId,final  String rtype); 
}
