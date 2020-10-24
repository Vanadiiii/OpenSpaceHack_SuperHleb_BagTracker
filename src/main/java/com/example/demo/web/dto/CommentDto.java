package com.example.demo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
@Builder
@AllArgsConstructor
public class CommentDto {
    private UUID id;
    private UserDto user;
    private String text;
    private LocalDateTime createDate;
}
