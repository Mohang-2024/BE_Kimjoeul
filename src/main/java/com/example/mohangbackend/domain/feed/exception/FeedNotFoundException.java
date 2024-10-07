package com.example.mohangbackend.domain.feed.exception;

import com.example.mohangbackend.global.exception.error.CustomException;
import com.example.mohangbackend.global.exception.error.ErrorCode;

public class FeedNotFoundException extends CustomException {

    public static final FeedNotFoundException EXCEPTION = new FeedNotFoundException();

    private FeedNotFoundException() {
        super(ErrorCode.FEED_NOT_FOUND);
    }
}
