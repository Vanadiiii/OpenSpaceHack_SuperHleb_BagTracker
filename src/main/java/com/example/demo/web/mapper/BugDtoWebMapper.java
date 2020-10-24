package com.example.demo.web.mapper;

import com.example.demo.domain.entity.Bug;
import com.example.demo.web.dto.BugDto;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface BugDtoWebMapper extends Function<BugDto, Bug> {
}
