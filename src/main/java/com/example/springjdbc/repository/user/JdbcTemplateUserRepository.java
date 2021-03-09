package com.example.springjdbc.repository.user;

import com.example.springjdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public class JdbcTemplateUserRepository implements UserRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTemplateUserRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Optional<User> findAll(String user_id) {
        List<User> result = jdbcTemplate.query("SELECT * FROM user WHERE user_id = ?", userRowMapper(), user_id);
        return result.stream().findAny();
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
