package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface IAchievementRepository extends JpaRepository<Achievement, UUID> {
    List<Achievement> findByUserId(UUID userId);
}
