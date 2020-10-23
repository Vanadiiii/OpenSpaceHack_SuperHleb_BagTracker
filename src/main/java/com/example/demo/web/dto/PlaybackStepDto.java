package com.example.demo.web.dto;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class PlaybackStepDto {
    private UUID id;
    private Integer order;
    private String text;
}
