package com.example.springjdbc;

import com.example.springjdbc.repository.user.JdbcTemplateUserRepository;
import com.example.springjdbc.repository.user.UserRepository;
import com.example.springjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public UserRepository userRepository(){
//        return new JdbcUserRepository(dataSource);
        return new JdbcTemplateUserRepository(dataSource);
    }

    @Autowired
    public UserService userService(){
        return new UserService(userRepository());
    }
}
