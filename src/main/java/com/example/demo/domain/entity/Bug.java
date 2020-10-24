package com.example.demo.domain.entity;

import com.example.demo.enums.BugStatus;
import com.example.demo.enums.ProductType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
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
@Builder
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
