package com.example.demo.domain.entity;

import com.example.demo.enums.BugStatus;
import com.example.demo.enums.ProductType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "bug")
@NoArgsConstructor
public class Bug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Enumerated(value = EnumType.STRING)
    private ProductType productType;
    private LocalDateTime creationData;
    private String phoneModel;
    private String osVersion;
    private String productVersion;
    @OneToMany
    private List<PlaybackStep> playbackSteps;
    private String screenUrl;
    @Enumerated(value = EnumType.STRING)
    private BugStatus bugStatus;
    @ManyToOne
    private User author;
    @ManyToOne
    private User reviewer;
    @OneToMany
    private List<Comment> comments;
    private Integer cost;
}
