package com.bisa.health.app.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.bisa.health.app.constraints.ReportStatusConstraint;
import com.bisa.health.app.enumerate.ReportStatus;

public class ReportStatusValidator implements ConstraintValidator<ReportStatusConstraint, Enum<ReportStatus>> {

	public void initialize(ReportStatusConstraint constraintAnnotation) {
		
	}

	public boolean isValid(Enum<ReportStatus> value, ConstraintValidatorContext context) {

		if(value instanceof ReportStatus){
			return true;
		}
		return false;
	}

	



}
