package com.example.demo.web.mapper;

import com.example.demo.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@FunctionalInterface
@Mapper(componentModel = "spring")
public interface UserPatcher {

    User apply(@MappingTarget User currentUser, User newUser);
}