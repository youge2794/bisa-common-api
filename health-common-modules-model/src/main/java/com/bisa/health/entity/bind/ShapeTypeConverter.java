package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import com.bisa.health.app.enumerate.ShapeTypeEnum;

@Converter
public class ShapeTypeConverter implements AttributeConverter<ShapeTypeEnum, Integer>{

	public Integer convertToDatabaseColumn(ShapeTypeEnum attribute) {
		return attribute.getValue();
	}

	public ShapeTypeEnum convertToEntityAttribute(Integer dbData) {
		return ShapeTypeEnum.getByValue(dbData);
	}

}