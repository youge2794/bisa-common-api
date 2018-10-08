package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bisa.health.app.constraint.ServiceTypeConstraint;
import com.bisa.health.app.enumerate.ServiceType;

public class ServiceTypeValidator implements ConstraintValidator<ServiceTypeConstraint, Enum<ServiceType>> {

	public void initialize(ServiceTypeConstraint constraintAnnotation) {
		
	}

	public boolean isValid(Enum<ServiceType> value, ConstraintValidatorContext context) {
		if(value instanceof ServiceType){
			return true;
		}
		
		return false;
	}
}
