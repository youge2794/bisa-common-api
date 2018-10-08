package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.ShapeTypeEnum;

public class ShapeTypeEnumConverter implements Converter<String, ShapeTypeEnum>{

	public ShapeTypeEnum convert(String source) {

		if(!StringUtils.isEmpty(source)){
			try{
				int mSource=Integer.parseInt(source);
				return ShapeTypeEnum.getByValue(mSource);
			}catch (NumberFormatException e) {
				for(ShapeTypeEnum em:ShapeTypeEnum.values()){
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
