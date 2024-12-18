package com.techie.backend.global.exception.user;

import com.techie.backend.global.exception.ExceptionType;
import lombok.Getter;

@Getter
public class InvalidOldPasswordException extends RuntimeException {
    private final ExceptionType exceptionType = ExceptionType.INVALID_OLD_PASSWORD;

    public InvalidOldPasswordException() {
        super(ExceptionType.INVALID_OLD_PASSWORD.getMessage());
    }
}