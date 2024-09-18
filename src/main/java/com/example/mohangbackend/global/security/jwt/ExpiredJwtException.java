package com.example.mohangbackend.global.security.jwt;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;

public class ExpiredJwtException extends CustomException {

    public static final ExpiredJwtException EXCEPTION = new ExpiredJwtException();

    private ExpiredJwtException() {
        super(ErrorCode.EXPIRED_JWT);
    }
}
