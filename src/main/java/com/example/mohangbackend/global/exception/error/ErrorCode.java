package com.example.mohangbackend.global.exception.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    PASSWORD_MISMATCH(401, "Password Mismatched"),
    USER_NOT_FOUND(404, "User Not Found"),
    USER_ALREADY_EXIST(409, "User Already Exits"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int status;
    private final String messsage;
}
