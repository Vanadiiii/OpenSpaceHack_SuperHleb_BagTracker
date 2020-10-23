package com.example.demo.controller;

import com.example.demo.controller.dto.UserDto;
import com.example.demo.controller.mappers.UserUserDtoMapper;
import com.example.demo.controller.mappers.UserWebMapper;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.sevice.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final IUserService userService;
    private final UserWebMapper userWebMapper;
    private final UserUserDtoMapper userUserDtoMapper;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable UUID userId) {
        return ResponseEntity.ok(userWebMapper.apply(userService.getUser(userId)));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Void> updatePersonalInfo(
            @PathVariable UUID userId,
            @RequestBody UserDto userDto
    ) {
        User user = userUserDtoMapper.apply(userDto);
        userService.updateUser(userId, user);
        return ResponseEntity.ok().build();
    }
}
