package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.SexTypeEnum;

public class SexTypeEnumConverter implements Converter<String, SexTypeEnum>{

	public SexTypeEnum convert(String source) {
		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return SexTypeEnum.getByValue(mSource);
			}catch (NumberFormatException e) {
				
				for(SexTypeEnum em:SexTypeEnum.values()){
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
