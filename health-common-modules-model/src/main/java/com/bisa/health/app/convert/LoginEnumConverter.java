package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.LoginTypeEnum;

public class LoginEnumConverter implements Converter<String, LoginTypeEnum>{

	public LoginTypeEnum convert(String source) {
		
		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return LoginTypeEnum.getByValue(mSource);
			}catch (NumberFormatException e) {
				
				for(LoginTypeEnum em:LoginTypeEnum.values()){
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
