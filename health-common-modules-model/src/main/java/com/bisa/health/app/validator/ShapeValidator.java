package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bisa.health.app.constraints.ShapeConstraint;
import com.bisa.health.app.enumerate.ShapeTypeEnum;

public class ShapeValidator implements ConstraintValidator<ShapeConstraint, Enum<ShapeTypeEnum>> {

	public void initialize(ShapeConstraint constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	public boolean isValid(Enum<ShapeTypeEnum> value, ConstraintValidatorContext context) {
		if(value instanceof ShapeTypeEnum){
			return true;
		}
		return false;
	}



}
