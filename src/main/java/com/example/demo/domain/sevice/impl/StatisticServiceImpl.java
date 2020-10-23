package com.example.demo.domain.sevice.impl;

import com.example.demo.domain.entity.Statistic;
import com.example.demo.domain.sevice.IStatisticService;

import java.util.UUID;

public class StatisticServiceImpl implements IStatisticService {
    @Override
    public UUID createStatistic(Statistic statistic) {
        return null;
    }

    @Override
    public Statistic getStatistic(UUID statisticId) {
        return null;
    }

    @Override
    public Statistic getStatisticByUserId(UUID userId) {
        return null;
    }

    @Override
    public void updateStatistic(UUID statisticId, Statistic statistic) {

    }

    @Override
    public void removeStatistic(UUID statisticId) {

    }
}
