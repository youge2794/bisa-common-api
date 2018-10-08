package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bisa.health.app.enumerate.ServiceType;

@Converter
public class ServiceTypeConverter implements AttributeConverter<ServiceType, String>{

	public String convertToDatabaseColumn(ServiceType attribute) {
		return attribute.getValue();
	}

<<<<<<< HEAD
	public ServiceType convertToEntityAttribute(Integer dbData) {
		if(dbData==null){
			return null;
		}
=======
	public ServiceType convertToEntityAttribute(String dbData) {
>>>>>>> a54818b38ea728c49410048cc4cbd6db4f2fd577
		return ServiceType.getByValue(dbData);
	}

}
