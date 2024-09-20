package com.example.mohangbackend.domain.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "tbl_user")
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String accountId;

    @Column(nullable = false)
    private String password;

    @Column(length = 13)
    private String phoneNumber;

    @Column(length = 4)
    private String age;

    @Builder
    private User(String accountId, String password, String phoneNumber, String age)
    {
        this.accountId = accountId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.age = age;

    }
}
