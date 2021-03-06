package com.example.demo.domain.sevice.impl;

import com.example.demo.domain.IAchievementDomainService;
import com.example.demo.domain.IBugDomainService;
import com.example.demo.domain.IUserDomainService;
import com.example.demo.domain.entity.Achievement;
import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.entity.Statistic;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.sevice.IStatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StatisticServiceImpl implements IStatisticService {
    private final IUserDomainService userDomainService;
    private final IAchievementDomainService achievementDomainService;
    private final IBugDomainService bugDomainService;

    @Override
    public Statistic getStatistic(UUID userId) {
        User user = userDomainService.getUser(userId);
        List<Bug> bugList = bugDomainService.getBugsByAuthorId(userId);
        List<Achievement> achievementList = achievementDomainService.getAchievementsByUserId(userId);
        return Statistic.builder()
                .user(user)
                .bugList(bugList)
                .achievementList(achievementList)
                .build();
    }
}
