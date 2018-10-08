package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.UsersVerifiedEnum;

public class UsersVerifiedEnumConverter implements Converter<String, UsersVerifiedEnum>{

	public UsersVerifiedEnum convert(String source) {


		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return UsersVerifiedEnum.getByValue(mSource);
			}catch (NumberFormatException e) {
				for(UsersVerifiedEnum em:UsersVerifiedEnum.values()){
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
