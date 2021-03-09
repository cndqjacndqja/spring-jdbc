package com.example.springjdbc.service;

import com.example.springjdbc.model.User;
import com.example.springjdbc.repository.user.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Long SignUp(User user){
        userRepository.save(user);
        return user.getUserIdx();
    }

}
