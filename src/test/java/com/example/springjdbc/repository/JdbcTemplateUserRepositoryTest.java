package com.example.springjdbc.repository;

import com.example.springjdbc.repository.user.JdbcTemplateUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JdbcTemplateUserRepositoryTest {

    @Autowired
    JdbcTemplateUserRepository jdbcTemplateUserRepository;

    @Test
    void findAll() {

        jdbcTemplateUserRepository.findAll("cads");


    }
}