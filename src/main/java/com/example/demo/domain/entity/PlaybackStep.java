package com.example.demo.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "playback_step")
@NoArgsConstructor
public class PlaybackStep {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Type(type = "uuid-char")
    private UUID id;
    @Column(name = "ordr")
    private Integer order;
    @ManyToOne
    private Bug bug;
    private String text;
}
