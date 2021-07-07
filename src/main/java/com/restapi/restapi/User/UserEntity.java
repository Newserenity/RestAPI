package com.restapi.restapi.User;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@NoArgsConstructor
public class UserEntity {

    @Id
    private Integer idx;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private Date joinDate;

    @Column
    private String softDelete;

    @Column
    private String baned;

    @Builder
    public UserEntity(String email, String password, Date joinDate, String softDelete, String baned) {
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        this.softDelete = softDelete;
        this.baned =baned;
    }

}
