package com.example.springjdbc.repository;

import com.example.springjdbc.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    List<User> findAll();
}
