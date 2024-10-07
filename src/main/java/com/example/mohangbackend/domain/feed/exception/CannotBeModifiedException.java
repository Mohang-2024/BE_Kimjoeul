package com.example.mohangbackend.domain.feed.exception;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;

public class CannotBeModifiedException extends CustomException {

    public static final CannotBeModifiedException EXCEPTION = new CannotBeModifiedException();

    private CannotBeModifiedException() {
        super(ErrorCode.CANNOT_BE_MODIFIED);
    }
}
