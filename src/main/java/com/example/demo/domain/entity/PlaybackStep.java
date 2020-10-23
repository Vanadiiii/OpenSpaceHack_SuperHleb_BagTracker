package com.example.demo.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "playback_step")
@NoArgsConstructor
public class PlaybackStep {
    private UUID id;
    private Integer order;
    private Bug bug;
    private String text;
}
