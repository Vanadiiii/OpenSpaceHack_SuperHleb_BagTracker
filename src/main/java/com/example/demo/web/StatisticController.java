package com.example.demo.web;

import com.example.demo.domain.sevice.IStatisticService;
import com.example.demo.web.dto.StatisticDto;
import com.example.demo.web.mapper.StatisticWebMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/statistic")
public class StatisticController {
    private final StatisticWebMapper statisticWebMapper;
    private final IStatisticService statisticService;

    @GetMapping("/{userId}")
    public ResponseEntity<StatisticDto> getStatistic(@PathVariable UUID userId) {
        return ResponseEntity.ok(statisticWebMapper.apply(statisticService.getStatistic(userId)));
    }
}
