package com.example.demo.domain.sevice;

import com.example.demo.domain.entity.Statistic;

import java.util.UUID;

public interface IStatisticService {
    UUID createStatistic(Statistic statistic);

    Statistic getStatistic(UUID statisticId);

    Statistic getStatisticByUserId(UUID userId);

    void updateStatistic(UUID statisticId, Statistic statistic);

    void removeStatistic(UUID statisticId);
}
