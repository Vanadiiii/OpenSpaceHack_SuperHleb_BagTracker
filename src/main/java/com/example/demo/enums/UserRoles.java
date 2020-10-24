package com.example.demo.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRoles {
    ROLE_ADMIN("ADMIN"),
    ROLE_USER("USER"),
    ROLE_QA("QA"),
    ;
    private final String value;
}
