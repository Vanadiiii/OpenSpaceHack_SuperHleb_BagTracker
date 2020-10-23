package com.example.demo.controller;

import com.example.demo.domain.entity.User;
import com.example.demo.sevice.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    public User getUser(UUID userId) {
        return userService.getUser(userId);
    }

    public void updatePersonalInfo(UUID userId, User user) {
        userService.updateUser(userId, user);
    }
}
