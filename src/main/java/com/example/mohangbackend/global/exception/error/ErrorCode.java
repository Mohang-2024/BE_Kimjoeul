package com.example.mohangbackend.global.exception.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    PASSWORD_MISMATCH(401, "Password Mismatched"),
    EXPIRED_JWT(401, "Expired Jwt"),
    INVALID_JWT(401, "Invalid Jwt"),
    INVALID_REFRESH_TOKEN(401, "Invalid Refresh Token"),
    CANNOT_BE_DELETED(401, "Cannot Be Deleted"),
    CANNOT_BE_MODIFIED(401, "Cannot Be Modified"),

    REFRESH_TOKEN_NOT_FOUND(404, "Refresh Token Not Found"),
    USER_NOT_FOUND(404, "User Not Found"),
    FEED_NOT_FOUND(404, "Feed Not Found"),

    USER_ALREADY_EXIST(409, "User Already Exits"),

    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int status;
    private final String messsage;
}
