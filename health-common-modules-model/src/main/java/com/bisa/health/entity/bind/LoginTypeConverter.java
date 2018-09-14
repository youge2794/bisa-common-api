package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bisa.health.app.enumerate.LoginTypeEnum;

@Converter
public class LoginTypeConverter implements AttributeConverter<LoginTypeEnum, Integer>{

	public Integer convertToDatabaseColumn(LoginTypeEnum attribute) {
		return attribute.getValue();
	}

	public LoginTypeEnum convertToEntityAttribute(Integer dbData) {
		if(dbData==null){
			return null;
		}
		return LoginTypeEnum.getByValue(dbData);
	}

}
