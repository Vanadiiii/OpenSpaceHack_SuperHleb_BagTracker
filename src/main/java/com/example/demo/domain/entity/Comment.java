package com.example.demo.domain.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "comment")
@NoArgsConstructor
public class Comment {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Type(type = "uuid-char")
    private UUID id;
    @ManyToOne
    private User user;
    @ManyToOne
    private Bug bug;
    private String text;
    private LocalDateTime createDate;
}
