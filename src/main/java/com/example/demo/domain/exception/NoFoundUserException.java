package com.example.demo.domain.exception;

import java.util.UUID;

public class NoFoundUserException extends RuntimeException {
    public NoFoundUserException() {
        super();
    }

    public NoFoundUserException(String message) {
        super(message);
    }

    public static NoFoundUserException init(UUID userId) {
        return new NoFoundUserException("There are no such user - " + userId);
    }
}
