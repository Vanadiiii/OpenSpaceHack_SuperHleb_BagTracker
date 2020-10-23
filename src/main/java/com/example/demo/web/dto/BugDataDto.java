package com.example.demo.web.dto;

import com.example.demo.enums.BugStatus;
import com.example.demo.enums.ProductType;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Value
@Builder
public class BugDataDto {
    private UUID id;
    private ProductType productType;
    private LocalDateTime creationData;
    private String phoneModel;
    private String osVersion;
    private String productVersion;
    private List<PlaybackStepDto> playbackSteps;
    private String screenUrl;
    private BugStatus bugStatus;
    private UserDto author;
    private UserDto reviewer;
    private List<CommentDto> comments;
    private Integer cost;
}
