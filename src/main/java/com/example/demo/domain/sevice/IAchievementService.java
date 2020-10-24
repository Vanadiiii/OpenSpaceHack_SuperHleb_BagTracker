package com.example.demo.domain.sevice;

import com.example.demo.domain.entity.Achievement;

import java.util.List;
import java.util.UUID;

public interface IAchievementService {
    Achievement getAchievement(UUID id);

    List<Achievement> getAchievementByUserId(UUID userId);
}
