package com.example.demo.domain.repository;

import com.example.demo.domain.entity.UserStatistic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserStatisticRepository extends JpaRepository<UserStatistic, UUID> {
}
