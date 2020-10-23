package com.example.demo.domain.entity;

import lombok.Data;

import java.util.UUID;

@Data
public class Achievement {
    private final UUID id;
    private final String name;
    private final String definition;
    private final long coin;
}
