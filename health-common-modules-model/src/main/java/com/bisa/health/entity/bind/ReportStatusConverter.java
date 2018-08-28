package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bisa.health.app.enumerate.ReportStatus;

@Converter
public class ReportStatusConverter implements AttributeConverter<ReportStatus, Integer>{

	public Integer convertToDatabaseColumn(ReportStatus attribute) {
		return attribute.getValue();
	}

	public ReportStatus convertToEntityAttribute(Integer dbData) {
		return ReportStatus.getByValue(dbData);
	}

}
