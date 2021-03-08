package com.example.springjdbc;

import com.example.springjdbc.repository.JdbcUserRepository;
import com.example.springjdbc.repository.UserRepository;
import com.example.springjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public UserRepository userRepository(){
        return new JdbcUserRepository(dataSource);
    }

    @Autowired
    public UserService userService(){
        return new UserService(userRepository());
    }
}
