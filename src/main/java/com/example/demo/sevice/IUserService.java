package com.example.demo.sevice;

import com.example.demo.domain.entity.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    UUID createUser(User user);

    User getUser(UUID userId);

    List<User> getUsers();

    void updateUser(UUID userId, User user);

    void removeUser(UUID userId);
}
