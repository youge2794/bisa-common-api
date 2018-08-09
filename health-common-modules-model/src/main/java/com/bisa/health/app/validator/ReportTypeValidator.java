package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.bisa.health.app.constraints.ReportStatusConstraint;
import com.bisa.health.app.enumerate.ReportType;
public class ReportTypeValidator implements ConstraintValidator<ReportStatusConstraint, Enum<ReportType>> {

	public void initialize(ReportStatusConstraint constraintAnnotation) {
		
	}

	public boolean isValid(Enum<ReportType> value, ConstraintValidatorContext context) {
		if(value instanceof ReportType){
			return true;
		}
		
		return false;
	}



}
