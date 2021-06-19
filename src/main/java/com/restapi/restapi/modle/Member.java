package com.restapi.restapi.modle;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Member {
    private int idx;
    private String name;
    private String email;
    private String password;
    private Date createdAt; // 가입한 날짜
}
