package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BugStatus {
    NEW(1),
    ALLOCATION(5),
    REVIEWING(10),
    DONE(50),
    NOT_REPLICATED(0),
    CLOSE_AS_DUPLICATED(0);
    private final long cost;
}
