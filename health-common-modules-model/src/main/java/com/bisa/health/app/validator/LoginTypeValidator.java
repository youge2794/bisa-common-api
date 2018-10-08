package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bisa.health.app.constraint.LoginTypeConstraint;
import com.bisa.health.app.enumerate.LoginTypeEnum;


public class LoginTypeValidator  implements ConstraintValidator<LoginTypeConstraint, Enum<LoginTypeEnum>> {

	public void initialize(LoginTypeConstraint constraintAnnotation) {
		
	}

	public boolean isValid(Enum<LoginTypeEnum> value, ConstraintValidatorContext context) {
		if(value instanceof LoginTypeEnum){
			return true;
		}
		return false;
	}



}
