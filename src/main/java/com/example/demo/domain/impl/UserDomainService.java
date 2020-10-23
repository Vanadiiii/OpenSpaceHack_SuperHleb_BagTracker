package com.example.demo.domain.impl;

import com.example.demo.domain.entity.User;
import com.example.demo.domain.exception.NoSuchUserException;
import com.example.demo.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserDomainService {
    private final UserRepository userRepository;

    public UUID create(User user) {
        return userRepository.save(user)
                .getId();
    }

    public User getUser(UUID userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> NoSuchUserException.init(userId));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void update(UUID userId, User user) {
        // TODO: 24/10/20
    }
}
