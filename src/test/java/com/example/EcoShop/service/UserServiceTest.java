package com.example.EcoShop.service;

import com.example.EcoShop.domain.User;
import com.example.EcoShop.repos.UserRepos;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
//модульное
public class UserServiceTest {

    private final UserRepos userRepos = mock(UserRepos.class);

    private final UserService userService = new UserService(userRepos);

    @Test
    public void addUser() {
        User user = new User();
        boolean isUserCreated = userService.addUser(user);
        Assert.assertTrue(isUserCreated);
    }

    @Test
    public void addUserFailTest() {
        User user = new User();
        user.setUsername("Tasya");

        Mockito.doReturn(new User())
                .when(userRepos)
                .findByUsername("Tasya");

        boolean isUserCreated = userService.addUser(user);

        Assert.assertFalse(isUserCreated);
    }
}