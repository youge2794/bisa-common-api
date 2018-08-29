package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bisa.health.app.enumerate.SportTypeEnum;

@Converter
public class SportTypeConverter implements AttributeConverter<SportTypeEnum, Integer>{

	public Integer convertToDatabaseColumn(SportTypeEnum attribute) {
		if(attribute==null)
			return SportTypeEnum.NEVER.getValue();
		return attribute.getValue();
	}

	public SportTypeEnum convertToEntityAttribute(Integer dbData) {
		return SportTypeEnum.getByValue(dbData);
	}

}
