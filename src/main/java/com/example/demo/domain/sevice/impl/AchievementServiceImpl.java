package com.example.demo.domain.sevice.impl;

import com.example.demo.domain.IAchievementDomainService;
import com.example.demo.domain.entity.Achievement;
import com.example.demo.domain.sevice.IAchievementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AchievementServiceImpl implements IAchievementService {
    private final IAchievementDomainService achievementDomainService;

    @Override
    public Achievement getAchievement(UUID id) {
        return achievementDomainService.getAchievement(id);
    }

    @Override
    public List<Achievement> getAchievementByUserId(UUID userId) {
        return achievementDomainService.getAchievementsByUserId(userId);
    }
}
