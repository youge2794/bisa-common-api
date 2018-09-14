package com.bisa.health.entity.bind;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import com.bisa.health.app.enumerate.SportTypeEnum;
import com.bisa.health.shop.enumerate.GoodsClassify;

@Converter
public class GoodsClassifyConverter implements AttributeConverter<GoodsClassify, Integer>{

	public Integer convertToDatabaseColumn(GoodsClassify attribute) {
		return attribute.getValue();
	}

	public GoodsClassify convertToEntityAttribute(Integer dbData) {
		if(dbData==null){
			return null;
		}
		return GoodsClassify.getByValue(dbData);
	}

}
