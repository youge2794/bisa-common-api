package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bisa.health.app.constraints.SexConstraint;
import com.bisa.health.app.enumerate.SexTypeEnum;

public class SexValidator implements ConstraintValidator<SexConstraint, Enum<SexTypeEnum>> {

	public void initialize(SexConstraint constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(Enum<SexTypeEnum> value, ConstraintValidatorContext context) {
		if(value instanceof SexTypeEnum){
			return true;
		}
		return false;
	}

	


}
