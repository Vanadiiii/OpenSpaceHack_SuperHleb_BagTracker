package com.example.demo.domain.entity;

import com.example.demo.enums.BugStatus;
import com.example.demo.enums.BugType;
import com.example.demo.enums.ProductType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "bug")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bug {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Type(type = "uuid-char")
    private UUID id;
    @Enumerated(value = EnumType.STRING)
    private ProductType productType;
    private LocalDateTime creationData;
    private String phoneModel;
    private String osVersion;
    private String productVersion;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bug_id")
    private List<PlaybackStep> playbackSteps;
    private String screenUrl;
    @Enumerated(value = EnumType.STRING)
    private BugStatus bugStatus;
    @Enumerated(value = EnumType.STRING)
    private BugType bugType;
    @ManyToOne
    private User author;
    @ManyToOne
    private User reviewer;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<Comment> comments;
    private Integer cost;
    private Boolean isDuplicate;
}
