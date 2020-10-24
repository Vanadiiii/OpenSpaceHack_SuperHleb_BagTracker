package com.example.demo.web.mapper;

import com.example.demo.domain.entity.User;
import com.example.demo.web.dto.UserDataDto;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface UserDataDtoWebMapper extends Function<UserDataDto, User> {
}
