package com.example.demo.controller.mappers;

import com.example.demo.controller.dto.BugDto;
import com.example.demo.domain.entity.Bug;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface BugWebMapper extends Function<Bug, BugDto> {
}
