package com.example.demo.domain;

import com.example.demo.domain.entity.Statistic;

import java.util.UUID;

public interface IStatisticDomainService {
    Statistic getStatistic(UUID userId);
}
