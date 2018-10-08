package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.UsersActivateEnum;

public class UsersActivateEnumConverter implements Converter<String, UsersActivateEnum>{

	public UsersActivateEnum convert(String source) {

		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return UsersActivateEnum.getByValue(mSource);
			}catch (NumberFormatException e) {
				for(UsersActivateEnum em:UsersActivateEnum.values()){
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
