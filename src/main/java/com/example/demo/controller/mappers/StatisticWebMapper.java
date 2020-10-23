package com.example.demo.controller.mappers;

import com.example.demo.controller.dto.StatisticDto;
import com.example.demo.controller.dto.UserDto;
import com.example.demo.domain.entity.Statistic;
import com.example.demo.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface StatisticWebMapper extends Function<Statistic, StatisticDto> {
}
