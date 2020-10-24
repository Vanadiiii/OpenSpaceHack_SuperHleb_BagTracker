package com.example.demo.domain.exception;

import java.util.UUID;

public class NoFoundAchievementException extends RuntimeException {
    public NoFoundAchievementException() {
        super();
    }

    public NoFoundAchievementException(String message) {
        super(message);
    }

    public static NoFoundAchievementException init(UUID achievementId) {
        return new NoFoundAchievementException("There are no such achievement - " + achievementId);
    }
}
