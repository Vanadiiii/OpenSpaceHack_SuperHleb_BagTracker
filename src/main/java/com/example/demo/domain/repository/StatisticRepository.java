package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StatisticRepository extends JpaRepository<Statistic, UUID> {
}
