package com.example.mohangbackend.domain.feed.exception;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;

public class CannotBeDeletedException extends CustomException {

    public static final CannotBeDeletedException EXCEPTION = new CannotBeDeletedException();

    private CannotBeDeletedException() {
        super(ErrorCode.CANNOT_BE_DELETED);
    }
}
