package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bisa.health.app.enumerate.ReportType;

@Converter
public class ReportTypeConverter implements AttributeConverter<ReportType, Integer>{

	public Integer convertToDatabaseColumn(ReportType attribute) {
		return attribute.getValue();
	}

	public ReportType convertToEntityAttribute(Integer dbData) {
		if(dbData==null){
			return null;
		}
		return ReportType.getByValue(dbData);
	}

}
