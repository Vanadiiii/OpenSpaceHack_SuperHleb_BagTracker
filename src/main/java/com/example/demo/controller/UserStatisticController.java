package com.example.demo.controller;

import com.example.demo.sevice.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserStatisticController {
    private final IUserService userService;


}
