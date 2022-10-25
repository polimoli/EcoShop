package com.example.EcoShop.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result = false;
        if (value != null && !value.isEmpty()) {
            if (value.length() >= 3 )
            {
                if(value.length() <= 25) {
                    result = true;
                }
            }
        }
        return result;
    }

}