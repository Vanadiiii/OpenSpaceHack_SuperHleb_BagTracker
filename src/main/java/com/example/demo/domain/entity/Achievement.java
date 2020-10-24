package com.example.demo.domain.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "achievement")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Achievement {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Type(type = "uuid-char")
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    private String name;
    private String definition;
    private Long cost;
}
