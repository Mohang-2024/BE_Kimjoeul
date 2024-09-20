package com.example.mohangbackend.domain.user.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@NoArgsConstructor
public class SignUpRequest {

    @NotBlank
    @Size(min = 3, max = 20, message = "3자에서 20자까지 입력 가능합니다.")
    private String accountId;

    @NotBlank(message = "8자에서 20자까지 입력 가능합니다.")
    @Size(min = 8, max = 20, message = "8자에서 20자까지 입력 가능합니다.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\\\\\d~!@#$%^&*()+|=]{8,20}$")
    private String password;

    @Size(max = 13, message = "13자까지 입력 가능합니다.")
    private String phoneNumber;

    @Size(max = 4)
    private String age;
}
