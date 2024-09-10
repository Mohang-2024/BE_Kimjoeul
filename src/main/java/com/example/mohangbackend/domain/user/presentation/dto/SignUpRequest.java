package com.example.mohangbackend.domain.user.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignUpRequest {

    @NotBlank(message = "띄어쓰기를 허용하지 않습니다.")
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
