package com.reddragon.jstolorz.com.reddragon.jstolorz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator
         implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    public void initialize(CourseCode constraintAnnotation) {
            coursePrefix = constraintAnnotation.value();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {

        boolean result;

        if(value != null){
            return  value.startsWith(coursePrefix);
        }else{
            return true;
        }
    }
}
