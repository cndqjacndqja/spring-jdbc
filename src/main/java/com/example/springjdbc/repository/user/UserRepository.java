package com.example.springjdbc.repository.user;

import com.example.springjdbc.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findAll(String user_id);
}
