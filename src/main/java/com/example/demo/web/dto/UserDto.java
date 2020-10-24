package com.example.demo.web.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class UserDto {
    private UUID id;
    private String mail;
    private String phone;
    private String fio;
    private String login;
    private String password;
    private long rating;
    private long coins;
}
