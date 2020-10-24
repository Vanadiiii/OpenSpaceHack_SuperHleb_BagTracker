package com.example.demo.domain.impl;

import com.example.demo.domain.IAchievementDomainService;
import com.example.demo.domain.entity.Achievement;
import com.example.demo.domain.exception.NoFoundAchievementException;
import com.example.demo.domain.repository.IAchievementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class AchievementDomainServiceImpl implements IAchievementDomainService {
    private final IAchievementRepository achievementRepository;

    @Override
    public Achievement getAchievement(UUID id) {
        return achievementRepository.findById(id)
                .orElseThrow(() -> NoFoundAchievementException.init(id));
    }

    @Override
    public List<Achievement> getAchievementsByUserId(UUID userId) {
        return achievementRepository.findByUserId(userId);
    }
}
