package com.example.mohangbackend.domain.auth.exception;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;
import jakarta.persistence.criteria.CriteriaBuilder;

public class InvalidRefreshTokenException extends CustomException {

    public static final InvalidRefreshTokenException EXCEPTION = new InvalidRefreshTokenException();

    private InvalidRefreshTokenException() {
        super(ErrorCode.INVALID_REFRESH_TOKEN);
    }
}
