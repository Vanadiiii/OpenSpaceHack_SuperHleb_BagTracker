package com.example.demo.domain.factory;

import com.example.demo.domain.entity.PlaybackStep;
import com.example.demo.domain.entity.User;
import com.example.demo.enums.BugStatus;
import com.example.demo.enums.ProductType;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.List;

@Value
@Builder
public class BugData {
    private ProductType productType;
    private LocalDateTime creationData;
    private String phoneModel;
    private String osVersion;
    private String productVersion;
    private List<PlaybackStep> playbackSteps;
    private String screenUrl;
    private BugStatus bugStatus;
    private User author;
}
