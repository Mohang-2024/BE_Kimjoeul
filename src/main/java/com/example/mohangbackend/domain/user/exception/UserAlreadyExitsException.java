package com.example.mohangbackend.domain.user.exception;

import com.example.mohangbackend.global.exception.error.ErrorCode;
import com.example.mohangbackend.global.exception.error.CustomException;

public class UserAlreadyExitsException extends CustomException {
    public static final CustomException EXCEPTION = new UserAlreadyExitsException();

    private UserAlreadyExitsException() {

        super(ErrorCode.USER_ALREADY_EXIST);
    }

}
