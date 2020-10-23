package com.example.demo.controller.mappers;

import com.example.demo.controller.dto.BugDataDto;
import com.example.demo.domain.entity.Bug;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface BugDataDtoWebMapper extends Function<BugDataDto, Bug> {
}
