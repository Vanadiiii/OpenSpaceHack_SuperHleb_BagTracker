package com.example.demo.web.dto;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Builder
@Value
public class MessageDto {
    private String text;
    private UserDto user;
    private LocalDateTime creationDate;
}
