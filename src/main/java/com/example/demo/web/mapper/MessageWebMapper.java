package com.example.demo.web.mapper;

import com.example.demo.domain.entity.Message;
import com.example.demo.web.dto.MessageDto;
import org.mapstruct.Mapper;

import java.util.function.Function;

@Mapper(componentModel = "spring")
public interface MessageWebMapper extends Function<Message, MessageDto> {
}
