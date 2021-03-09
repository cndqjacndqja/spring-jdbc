package com.example.springjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    Long board_idx;
    String board_title;
    String board_content;
    Long user_idx;
}
