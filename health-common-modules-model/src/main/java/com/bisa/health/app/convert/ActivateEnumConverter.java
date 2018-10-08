package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.ActivateEnum;

public class ActivateEnumConverter implements Converter<String, ActivateEnum>{

	public ActivateEnum convert(String source) {
		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return ActivateEnum.getByValue(mSource);
			}catch (NumberFormatException e) {
				
				for(ActivateEnum em:ActivateEnum.values()){
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
