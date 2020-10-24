package com.example.demo.domain.mapper;

import com.example.demo.domain.entity.Bug;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BugPatcher {

    Bug apply(@MappingTarget Bug current, Bug newBug);
}
