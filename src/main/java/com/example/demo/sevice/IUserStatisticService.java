package com.example.demo.sevice;

import com.example.demo.domain.entity.UserStatistic;

import java.util.UUID;

public interface IUserStatisticService {
    UUID createStatistic(UserStatistic statistic);

    UserStatistic getStatistic(UUID statisticId);

    void updateStatistic(UUID statisticId, UserStatistic userStatistic);

    void removeStatistic(UUID statisticId);
}
