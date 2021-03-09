package com.example.springjdbc.repository;

import com.example.springjdbc.model.Board;
import com.example.springjdbc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BoardRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void save(Board board) {
        String sql = "INSERT INTO board(board_title, board_content, user_idx) values(?, ?, ?)";
        jdbcTemplate.update(sql, board.getBoard_title(), board.getBoard_content(), board.getUser_idx());
    }

    public List<Board> findAll(){
        String sql = "SELECT * FROM board";
        return jdbcTemplate.query(sql, boardListRowMapper());
    }

    private RowMapper<Board> boardListRowMapper() {
        return (rs, rowNum) -> {
                if (rowNum == 0){
                    return new Board();
                }

                Board board = new Board();
                board.setBoard_idx(rs.getLong("board_idx"));
                board.setBoard_content(rs.getString("board_content"));
                board.setBoard_title(rs.getString("board_title"));
                board.setUser_idx(rs.getLong("user_idx"));
                return board;
        };
    }

}
