package com.example.EcoShop.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class TagValidator implements ConstraintValidator<Tag, String> {

    @Override
    public boolean isValid(String tag, ConstraintValidatorContext context) {
        boolean result = false;
        if (tag != null && !tag.isEmpty()) {
            if (tag.length() >= 3) {
                if (tag.length() <= 20) {
                    result = true;
                }
            }
        }
        return result;
    }

}