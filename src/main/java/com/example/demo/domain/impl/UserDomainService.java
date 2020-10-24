package com.example.demo.domain.impl;

import com.example.demo.domain.IUserDomainService;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.exception.NoFoundUserException;
import com.example.demo.domain.repository.IUserRepository;
import com.example.demo.web.mapper.UserPatcher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserDomainService implements IUserDomainService {
    private final IUserRepository userRepository;
    private final UserPatcher userPatcher;

    @Override
    public UUID create(User user) {
        return userRepository.save(user).getId();
    }

    @Override
    public User getUser(UUID userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> NoFoundUserException.init(userId));
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void update(UUID userId, User user) {
        userRepository.save(userPatcher.apply(getUser(userId), user));
    }

    @Override
    public void remove(UUID userId) {
        userRepository.deleteById(userId);
    }
}
