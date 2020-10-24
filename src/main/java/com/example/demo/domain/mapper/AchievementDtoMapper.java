package com.example.demo.domain.mapper;

import com.example.demo.domain.entity.Achievement;
import com.example.demo.web.dto.AchievementDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring", uses = UserDtoMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AchievementDtoMapper extends Function<Achievement, AchievementDto> {
}
