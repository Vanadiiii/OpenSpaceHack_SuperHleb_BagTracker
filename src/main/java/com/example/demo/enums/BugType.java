package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BugType {
    SECURITY(1500),
    BLOCKER(400),
    MAJOR(200),
    MINOR(100),
    TEXT_DEFECT(10),
    ;
    private final long cost;
}
