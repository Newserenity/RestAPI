package com.restapi.restapi.User;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserDto {

    private Integer idx;
    private String email;
    private String password;
    private Date joinDate;
    private Boolean softDelete;
    private Boolean baned;
}
