package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bisa.health.app.constraint.ReportTypeConstraint;
import com.bisa.health.app.enumerate.ReportType;
public class ReportTypeValidator implements ConstraintValidator<ReportTypeConstraint, Enum<ReportType>> {

	public void initialize(ReportTypeConstraint constraintAnnotation) {
		
	}

	public boolean isValid(Enum<ReportType> value, ConstraintValidatorContext context) {
		if(value instanceof ReportType){
			return true;
		}
		
		return false;
	}



}
