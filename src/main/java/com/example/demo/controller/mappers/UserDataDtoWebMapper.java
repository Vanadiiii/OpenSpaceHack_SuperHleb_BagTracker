package com.example.demo.controller.mappers;

import com.example.demo.controller.dto.UserDataDto;
import com.example.demo.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface UserDataDtoWebMapper extends Function<UserDataDto, User> {
}
