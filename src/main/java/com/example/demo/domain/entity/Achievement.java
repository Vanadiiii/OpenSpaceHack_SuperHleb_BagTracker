package com.example.demo.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name = "achievement")
@NoArgsConstructor
public class Achievement {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Type(type = "uuid-char")
    private UUID id;
    private UUID userId;
    private String name;
    private String definition;
    private long coin;
}
