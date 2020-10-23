package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Data
@AllArgsConstructor
@Builder
public class Statistic {
    private final UUID userId;
    private List<UUID> bugIdList;
    private List<UUID> achievementIdList;
}
