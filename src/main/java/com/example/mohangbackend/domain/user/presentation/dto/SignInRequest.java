package com.example.mohangbackend.domain.user.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignInRequest {

    private String accountId;

    private String password;
}
