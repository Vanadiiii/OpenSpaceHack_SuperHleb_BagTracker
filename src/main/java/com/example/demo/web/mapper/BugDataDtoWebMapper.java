package com.example.demo.web.mapper;

import com.example.demo.domain.entity.Bug;
import com.example.demo.web.dto.BugDataDto;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface BugDataDtoWebMapper extends Function<BugDataDto, Bug> {
}
