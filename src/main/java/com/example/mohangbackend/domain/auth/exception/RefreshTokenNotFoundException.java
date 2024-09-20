package com.example.mohangbackend.domain.auth.exception;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;

public class RefreshTokenNotFoundException extends CustomException {

    public static final RefreshTokenNotFoundException EXCEPTION = new RefreshTokenNotFoundException();

    private RefreshTokenNotFoundException() {
        super(ErrorCode.REFRESH_TOKEN_NOT_FOUND);
    }

}
