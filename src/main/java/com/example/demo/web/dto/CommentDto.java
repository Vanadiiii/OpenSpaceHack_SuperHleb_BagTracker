package com.example.demo.web.dto;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
@Builder
public class CommentDto {
    private UUID id;
    private UserDto user;
    private String text;
    private LocalDateTime createDate;
}
