package com.example.EcoShop.domain;

import org.junit.Assert;
import org.junit.Test;
import sun.security.util.Password;

public class UserTest {

    @Test
    public void isEqual_OneUser_True() {// для кого метод
        User user1 = new User();
        long id = 12;
        user1.setId(id);
        User user2 = user1;
        boolean result = user1.equals(user2);
        Assert.assertTrue(result);
    }

    @Test
    public void isEqual_TwoUsers_False() {
        User user2 = new User();
        User user1 = new User();
        long id1 = 12, id2 = 123;

        user1.setId(id1);
        user1.setId(id2);
        boolean result = user1.equals(user2);
        Assert.assertFalse(result);
    }

    @Test
    public void isEqual_TwoDifferentObjects_False() {
        Password password=new Password();
        User user = new User();
        boolean result = user.equals(password);
        Assert.assertFalse(result);
    }

}