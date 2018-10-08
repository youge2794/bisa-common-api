package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.ReportStatus;
import com.bisa.health.app.enumerate.ReportType;

public class ReportTypeConverter implements Converter<String, ReportType>{

	public ReportType convert(String source) {
		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return ReportType.getByValue(mSource);
			}catch (NumberFormatException e) {
				
				for(ReportType em:ReportType.values()){
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
