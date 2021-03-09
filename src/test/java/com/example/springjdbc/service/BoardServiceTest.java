package com.example.springjdbc.service;

import com.example.springjdbc.model.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    BoardService boardService;

    @Test
    void saveBoard() {
        Board board = new Board();
        board.setUser_idx((long) 6);
        board.setBoard_title("test");
        board.setBoard_content("asdfnjkasd");
        boardService.saveBoard(board);
    }

    @Test
    void findAll() {
        System.out.println(boardService.findAll());
    }
}