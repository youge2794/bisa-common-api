package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.ServiceType;

public class ServiceTypeConverter implements Converter<String, ServiceType>{

	public ServiceType convert(String source) {
		if(!StringUtils.isEmpty(source)){
			return ServiceType.getByValue(source);
		}
		return null;
	}

}
