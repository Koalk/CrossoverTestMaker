package com.crossover.testmaker.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.crossover.testmaker.model.User;
import com.crossover.testmaker.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

    @Mock
    private UserService userService;

    private UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void shouldCreateUser() throws Exception {
    }

    private User stubServiceToReturnStoredUser() {
        final User user = new User();
        return user;
    }

}
