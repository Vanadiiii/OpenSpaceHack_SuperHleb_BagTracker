package com.example.demo.domain.sevice;

import com.example.demo.domain.entity.Statistic;

import java.util.UUID;

public interface IStatisticService {

    Statistic getStatistic(UUID userId);
}
