package com.example.springjdbc.service;

import com.example.springjdbc.model.User;
import com.jayway.jsonpath.internal.function.text.Length;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void findAll() {
        List<User> userList = userService.findAll();
    }
}