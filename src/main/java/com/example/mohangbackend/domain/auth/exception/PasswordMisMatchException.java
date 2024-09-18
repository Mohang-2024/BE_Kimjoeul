package com.example.mohangbackend.domain.auth.exception;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;

public class PasswordMisMatchException extends CustomException {

    public static final PasswordMisMatchException EXCEPTION = new PasswordMisMatchException();

    private PasswordMisMatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
