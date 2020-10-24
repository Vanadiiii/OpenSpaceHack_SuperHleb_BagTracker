package com.example.demo.domain;

import com.example.demo.domain.entity.Statistic;
import com.example.demo.domain.entity.User;

import java.util.List;
import java.util.UUID;

public interface IUserDomainService {
    UUID create(User user);

    User getUser(UUID userId);

    List<User> getUsers();

    void update(UUID userId, User user);

    void updateStatistic(UUID userId, Statistic newStatistic);

    void remove(UUID userId);
}
