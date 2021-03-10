package com.example.springjdbc.service;

import com.example.springjdbc.model.Board;
import com.example.springjdbc.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {
    @Autowired
    BoardRepository boardRepository;

    public List<Board> findAll(){
        return boardRepository.findAll();
    }


}
