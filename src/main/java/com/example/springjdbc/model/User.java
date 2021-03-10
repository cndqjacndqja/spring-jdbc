package com.example.springjdbc.model;

import lombok.*;

import javax.persistence.*;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
@Entity @Table(name = "user")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    Long idx;

    @Column(name = "user_id")
    String id;
    @Column(name = "user_pwd")
    String pwd;
}
