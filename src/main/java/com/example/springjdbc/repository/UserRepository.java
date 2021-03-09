package com.example.springjdbc.repository;

import com.example.springjdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;


@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Optional<User> findAll(String user_id) {
        List<User> result = jdbcTemplate.query("SELECT * FROM user WHERE user_id = ?", userRowMapper(), user_id);
        return result.stream().findAny();
    }

    public void signUp(User user){
        String sql = "INSERT INTO user(user_id, user_pwd) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getUserId(), user.getUserPwd());
    }

    private RowMapper<User> userRowMapper(){
        return (rs, rowNum) -> {
            User user = new User();
            user.setUserIdx(rs.getLong("user_idx"));
            user.setUserId(rs.getString("user_id"));
            user.setUserPwd(rs.getString("user_pwd"));
            return user;
        };
    }
}
