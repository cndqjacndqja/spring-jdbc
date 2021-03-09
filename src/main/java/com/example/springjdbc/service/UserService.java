package com.example.springjdbc.service;

import com.example.springjdbc.model.User;
import com.example.springjdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Long SignUp(User user){
        userRepository.signUp(user);
        return user.getUserIdx();
    }

}
