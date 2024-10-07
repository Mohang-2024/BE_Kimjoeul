package com.example.mohangbackend.domain.user.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor
public class SignUpRequest {

    private String accountId;

    private String password;

    private String phoneNumber;

    private String age;
}
