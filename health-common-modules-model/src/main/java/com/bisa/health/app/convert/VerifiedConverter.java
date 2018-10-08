package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import com.bisa.health.app.enumerate.Verified;

public class VerifiedConverter implements Converter<String, Verified>{

	public Verified convert(String source) {

		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return Verified.getByValue(mSource);
			}catch (NumberFormatException e) {
				for(Verified em:Verified.values()){
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
