package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bisa.health.app.enumerate.ServiceType;

@Converter
public class ServiceTypeConverter implements AttributeConverter<ServiceType, Integer>{

	public Integer convertToDatabaseColumn(ServiceType attribute) {
		return attribute.getValue();
	}

	public ServiceType convertToEntityAttribute(Integer dbData) {
		if(dbData==null){
			return null;
		}
		return ServiceType.getByValue(dbData);
	}

}
