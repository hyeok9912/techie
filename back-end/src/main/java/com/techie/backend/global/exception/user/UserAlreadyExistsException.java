package com.techie.backend.global.exception.user;

import com.techie.backend.global.exception.ExceptionType;
import lombok.Getter;

@Getter
public class UserAlreadyExistsException extends RuntimeException {
    private final ExceptionType exceptionType;

    public UserAlreadyExistsException() {
        super(ExceptionType.USER_ALREADY_EXISTS.getMessage());
        this.exceptionType = ExceptionType.USER_ALREADY_EXISTS;
    }
}