package com.example.springjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "board")
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_idx")
    Long Id;

    @Column(name="board_title")
    String title;
    @Column(name = "board_content")
    String content;

    @JoinColumn(name = "user_idx")
    Long user_idx;
}
