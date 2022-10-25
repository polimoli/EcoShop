package com.example.EcoShop.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernameValidator implements ConstraintValidator<Username, String> {

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        boolean result = false;
        if (username != null && !username.isEmpty()) {
            if (username.length() >= 3 && username.length() <= 20){
                if(username.matches("[A-Za-z0-9А-Яа-яёЁ_]+")) {
                    result = true;
                }
            }
        }
        return result;
    }

}