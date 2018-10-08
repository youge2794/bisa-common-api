package com.bisa.health.app.convert;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;

import com.bisa.health.app.enumerate.RoleTypeEnum;

public class RoleTypeEnumConverter implements Converter<String, RoleTypeEnum>{

	public RoleTypeEnum convert(String source) {
		if(!StringUtils.isEmpty(source))
			return RoleTypeEnum.getByValue(source);
		return null;
	}

}
