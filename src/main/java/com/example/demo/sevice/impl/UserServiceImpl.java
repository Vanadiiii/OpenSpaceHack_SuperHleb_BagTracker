package com.example.demo.sevice.impl;

import com.example.demo.domain.entity.User;
import com.example.demo.domain.impl.UserDomainService;
import com.example.demo.sevice.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    private final UserDomainService userDomainService;

    @Override
    public UUID createUser(User user) {
        return userDomainService.create(user);
    }

    @Override
    public User getUser(UUID userId) {
        return userDomainService.getUser(userId);
    }

    @Override
    public List<User> getUsers() {
        return userDomainService.getUsers();
    }

    @Override
    public void updateUser(UUID userId, User user) {
        userDomainService.update(userId, user);
    }

    @Override
    public void removeUser(UUID userId) {

    }
}
