package com.bisa.health.app.convert;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter  implements Converter<String,Date>{
	
	private String pattern;
    public StringToDateConverter(String pattern){
        this.pattern=pattern;
    }

    public Date convert(String str){
        try{
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
            simpleDateFormat.setLenient(false);
            Date date= simpleDateFormat.parse(str);
            return date;
        }catch (Exception e) {
                return null;
        }
    }


}
