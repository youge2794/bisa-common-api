package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bisa.health.app.enumerate.ServiceType;

@Converter
public class ServiceTypeConverter implements AttributeConverter<ServiceType, String>{

	public String convertToDatabaseColumn(ServiceType attribute) {
		return attribute.getValue();
	}

	public ServiceType convertToEntityAttribute(String dbData) {
		return ServiceType.getByValue(dbData);
	}

}
