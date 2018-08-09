package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bisa.health.app.constraints.SportConstraint;
import com.bisa.health.app.enumerate.SportTypeEnum;

public class SportValidator implements ConstraintValidator<SportConstraint, Enum<SportTypeEnum>> {

	public void initialize(SportConstraint constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(Enum<SportTypeEnum> value, ConstraintValidatorContext context) {
		
		if(value instanceof SportTypeEnum){
			return true;
		}
		return false;
	}
	

}
