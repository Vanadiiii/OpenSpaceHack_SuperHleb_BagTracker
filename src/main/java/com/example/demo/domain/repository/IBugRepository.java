package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Bug;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IBugRepository extends JpaRepository<Bug, UUID> {
    List<Bug> findAllByAuthorId(UUID authorId);

    List<Bug> findAllByReviewerId(UUID reviewerId);
}
