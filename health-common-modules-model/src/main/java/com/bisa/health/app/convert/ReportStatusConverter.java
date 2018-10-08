package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.ReportStatus;

public class ReportStatusConverter implements Converter<String, ReportStatus>{

	public ReportStatus convert(String source) {
		
		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return ReportStatus.getByValue(mSource);
			}catch (NumberFormatException e) {
				
				for(ReportStatus em:ReportStatus.values()){
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
