package com.example.demo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
@AllArgsConstructor
public class AchievementDto {
    private UUID id;
    private UserDto userDto;
    private String name;
    private String definition;
    private Long cost;
}
