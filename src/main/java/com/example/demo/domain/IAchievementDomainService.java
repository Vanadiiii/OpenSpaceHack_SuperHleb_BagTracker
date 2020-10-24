package com.example.demo.domain;

import com.example.demo.domain.entity.Achievement;

import java.util.List;
import java.util.UUID;

public interface IAchievementDomainService {

    Achievement getAchievement(UUID id);

    List<Achievement> getAchievementsByUserId(UUID userId);
}
