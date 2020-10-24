package com.example.demo.web;

import com.example.demo.domain.entity.User;
import com.example.demo.domain.sevice.IUserService;
import com.example.demo.web.dto.UserDto;
import com.example.demo.web.mapper.UserUserDtoMapper;
import com.example.demo.web.mapper.UserWebMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
