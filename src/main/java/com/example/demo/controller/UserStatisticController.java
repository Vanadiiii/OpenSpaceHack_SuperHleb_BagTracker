package com.example.demo.controller;

import com.example.demo.domain.entity.UserStatistic;
import com.example.demo.sevice.IUserStatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class UserStatisticController {
    private final IUserStatisticService statisticService;

    public UserStatistic getStatistics(UUID statisticId) {
        return statisticService.getStatistic(statisticId);
    }
}
