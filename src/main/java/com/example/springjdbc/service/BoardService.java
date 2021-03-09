package com.example.springjdbc.service;

import com.example.springjdbc.model.Board;
import com.example.springjdbc.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public void saveBoard(Board board){
            boardRepository.save(board);
    }

    public List<Board> findAll(){
            return boardRepository.findAll();
    }
}
