package com.example.demo.web.dto;

import com.example.demo.domain.entity.Achievement;
import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor
public class StatisticDto {
    private User user;
    private List<Bug> bugList;
    private List<Achievement> achievementList;
}
