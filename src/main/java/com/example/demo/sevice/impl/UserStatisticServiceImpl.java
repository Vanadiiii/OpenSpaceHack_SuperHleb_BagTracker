package com.example.demo.sevice.impl;

import com.example.demo.domain.entity.UserStatistic;
import com.example.demo.sevice.IUserStatisticService;

import java.util.UUID;

public class UserStatisticServiceImpl implements IUserStatisticService {
    @Override
    public UUID createStatistic(UserStatistic statistic) {
        return null;
    }

    @Override
    public UserStatistic getStatistic(UUID statisticId) {
        return null;
    }

    @Override
    public UserStatistic getStatisticByUserId(UUID userId) {
        return null;
    }

    @Override
    public void updateStatistic(UUID statisticId, UserStatistic userStatistic) {

    }

    @Override
    public void removeStatistic(UUID statisticId) {

    }
}
