package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private UUID id;
    private String mail;
    private String phone;
    private String fio;
    private String login;
    private String password;
    private long rating;
    private long coins;
}
