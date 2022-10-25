package com.example.EcoShop.Validator;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.ConstraintValidatorContext;


public class PasswordValidatorTest {
    ConstraintValidatorContext context;
    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    public void isValidPassword_NullString_False() {
        String password = null;
        Assert.assertFalse(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_EmptyString_False() {
        String password = "";
        Assert.assertFalse(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Whitespace_False() {
        String password = " ";
        Assert.assertFalse(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length1_Fasle() {
        String password = "a";
        Assert.assertFalse(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length3_True() {
        String password = "123";
        Assert.assertTrue(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length2_Fasle() {
        String password = "aa";
        Assert.assertFalse(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length6_True() {
        String password = "newyear";
        Assert.assertTrue(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length15_True() {
        String password = "aaaaaaaaaa12345";
        Assert.assertTrue(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length20_True() {
        String password = "aaaaaaaaaa12345aaaaa";
        Assert.assertTrue(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length25_True() {
        String password = "aaaaaaaaaa12345aaaaaaaaaa";
        Assert.assertTrue(passwordValidator.isValid(password, context));
    }


    @Test
    public void isValidPassword_Length26_False() {
        String password = "aaaaaaaaaa12345aaaaaaaaaa6";
        Assert.assertFalse(passwordValidator.isValid(password, context));
    }

    @Test
    public void isValidPassword_Length9_True() {
        String password = "123456789";
        Assert.assertTrue(passwordValidator.isValid(password, context));
    }

}