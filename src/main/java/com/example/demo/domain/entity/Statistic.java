package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@AllArgsConstructor
@Builder
public class Statistic {
    private User user;
    private List<Bug> bugList;
    private List<Achievement> achievementList;
}
