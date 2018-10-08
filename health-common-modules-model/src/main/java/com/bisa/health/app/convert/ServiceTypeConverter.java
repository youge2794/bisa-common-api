package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.ServiceType;

public class ServiceTypeConverter implements Converter<String, ServiceType>{

	public ServiceType convert(String source) {
		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return ServiceType.getByValue(mSource);
			}catch (NumberFormatException e) {
				
				for(ServiceType em:ServiceType.values()){
					if(source.trim().equals(em.name())){
						return em;
					}
				}
				return null;
			}
			
		}
		return null;
	}

}
