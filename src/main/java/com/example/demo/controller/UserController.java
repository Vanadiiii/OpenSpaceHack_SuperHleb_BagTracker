package com.example.demo.controller;

import com.example.demo.controller.dto.UserDataDto;
import com.example.demo.controller.dto.UserDto;
import com.example.demo.controller.mappers.UserDataDtoWebMapper;
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
    private final UserDataDtoWebMapper userDataDtoWebMapper;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable UUID userId) {
        return ResponseEntity.ok(userWebMapper.apply(userService.getUser(userId)));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Void> updatePersonalInfo(
            @PathVariable UUID userId,
            @RequestBody UserDataDto userDataDto
    ) {
        User user = userDataDtoWebMapper.apply(userDataDto);
        userService.updateUser(userId, user);
        return ResponseEntity.ok().build();
    }
}
