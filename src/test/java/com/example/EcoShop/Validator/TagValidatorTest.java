package com.example.EcoShop.Validator;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.ConstraintValidatorContext;

public class TagValidatorTest {

    ConstraintValidatorContext context;
    TagValidator tagValidator = new TagValidator();

    @Test
    public void isValidPassword_NullString_False() {
        String tag = null;
        Assert.assertFalse(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_EmptyString_False() {
        String tag = "";
        Assert.assertFalse(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Whitespace_False() {
        String tag = " ";
        Assert.assertFalse(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length3_True() {
        String tag = "123";
        Assert.assertTrue(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length1_False() {
        String tag = "a";
        Assert.assertFalse(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length2_False() {
        String tag = "aa";
        Assert.assertFalse(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length10_True() {
        String tag = "aaaaaa12345";
        Assert.assertTrue(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length15_True() {
        String tag = "aaaaaa12345aaaaa";
        Assert.assertTrue(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length20_True() {
        String tag = "aaaaa12345aaaaa12345";
        Assert.assertTrue(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length21_False() {
        String tag = "aaaaa12345aaaaa123456";
        Assert.assertFalse(tagValidator.isValid(tag, context));
    }

    @Test
    public void isValidPassword_Length30_False() {
        String tag = "aaaaa12345aaaaa12345bbbbbbbbbb";
        Assert.assertFalse(tagValidator.isValid(tag, context));
    }

}