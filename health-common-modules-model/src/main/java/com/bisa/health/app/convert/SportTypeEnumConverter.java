package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.SportTypeEnum;

public class SportTypeEnumConverter implements Converter<String, SportTypeEnum>{

	public SportTypeEnum convert(String source) {


		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return SportTypeEnum.getByValue(mSource);
			}catch (NumberFormatException e) {
				for(SportTypeEnum em:SportTypeEnum.values()){
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
