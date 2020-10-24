package com.example.demo.web.mapper;

import com.example.demo.domain.entity.Statistic;
import com.example.demo.web.dto.StatisticDto;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface StatisticWebMapper extends Function<Statistic, StatisticDto> {
}
