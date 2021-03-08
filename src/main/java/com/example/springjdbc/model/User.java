package com.example.springjdbc.model;

import lombok.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    Long userIdx;
    String userId;
    String userPwd;
}
