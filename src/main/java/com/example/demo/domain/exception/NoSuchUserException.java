package com.example.demo.domain.exception;

import java.util.UUID;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException() {
        super();
    }

    public NoSuchUserException(String message) {
        super(message);
    }

    public static NoSuchUserException init(UUID userId) {
        return new NoSuchUserException("There are no such user - " + userId);
    }
}
