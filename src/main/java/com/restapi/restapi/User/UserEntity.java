package com.restapi.restapi.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String password;

    @Column
    private Date joinDate;

    @Column(length = 1)
    private String softDelete;

    @Column(length = 1)
    private String baned;

    @Builder
    public UserEntity(String email, String password, Date joinDate, String softDelete, String baned) {
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        this.softDelete = softDelete;
        this.baned = baned;
    }

}
