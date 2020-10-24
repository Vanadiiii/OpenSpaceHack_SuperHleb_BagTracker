package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Statistic {
    private User user;
    private List<Bug> bugList;
    private List<Achievement> achievementList;
}
