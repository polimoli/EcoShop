package com.example.EcoShop.Validator;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.ConstraintValidatorContext;

public class UserNameValidatorTest {
    ConstraintValidatorContext context;
    UsernameValidator usernameValidator = new UsernameValidator();

    @Test
    public void isValidUserName_NullString_False() {
        String username = null;
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_EmptyString_False() {
        String username = "";
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_LengthGreaterThan20_False() {
        String username = "ghhjHJHJПРОРОроророё1234567";
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }


    @Test
    public void isValidUserName_ValidUserName_True() {
        String username = "ЁжGreen123";
        Assert.assertTrue(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_Length2_False() {
        String username = "aa";
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_Length3_True() {
        String username = "aaa";
        Assert.assertTrue(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_Length20_True() {
        String username = "123456789ПолинаPolli";
        Assert.assertTrue(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_Length6_True() {
        String username = "aa_111";
        Assert.assertTrue(usernameValidator.isValid(username, context));
    }


    @Test
    public void isValidUserName_Length21_False() {
        String username = "Ёжик123456789Green123";
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_Length1_False() {
        String username = "1";
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_Length25_False() {
        String username = "Ёжик123456789Green1234567";
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }

    @Test
    public void isValidUserName_ForbiddenSymbol_False() {
        String username = "Зелёный-ёж";
        Assert.assertFalse(usernameValidator.isValid(username, context));
    }

}
