package com.example.mohangbackend.global.security.jwt;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;

public class InvalidJwtException extends CustomException {

    public static final InvalidJwtException EXCEPTION = new InvalidJwtException();

    private InvalidJwtException() {
        super(ErrorCode.INVALID_JWT);
    }
}
