package com.example.demo.domain.mapper;

import com.example.demo.domain.entity.Bug;
import com.example.demo.domain.factory.BugData;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface BugDataDomainMapper extends Function<BugData, Bug> {
}
