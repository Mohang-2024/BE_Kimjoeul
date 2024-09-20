package com.example.mohangbackend.domain.user.exception;

import com.example.mohangbackend.global.exception.error.ErrorCode;
import com.example.mohangbackend.global.exception.error.CustomException;

public class UserNotFoundException extends CustomException {

    public static final CustomException EXCEPTION = new UserNotFoundException();

    private UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
