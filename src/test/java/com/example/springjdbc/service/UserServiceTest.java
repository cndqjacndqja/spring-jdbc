package com.example.springjdbc.service;

import com.example.springjdbc.model.User;
import com.example.springjdbc.repository.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void signUp() {
        User user = new User();
        user.setUserId("cads");
        user.setUserPwd("1231");

        userRepository.save(user);

    }
}