package com.example.mohangbackend.domain.user.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 20, nullable = false, unique = true)
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
