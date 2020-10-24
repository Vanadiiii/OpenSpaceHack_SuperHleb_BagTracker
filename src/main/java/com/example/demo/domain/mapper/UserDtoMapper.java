package com.example.demo.domain.mapper;

import com.example.demo.domain.entity.User;
import com.example.demo.web.dto.UserDto;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface UserDtoMapper extends Function<User, UserDto> {
}
