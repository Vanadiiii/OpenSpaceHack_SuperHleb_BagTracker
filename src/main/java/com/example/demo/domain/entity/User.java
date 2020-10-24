package com.example.demo.domain.entity;

import com.example.demo.enums.UserRoles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usr")
public class User {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Type(type = "uuid-char")
    private UUID id;
    @Enumerated
    @ElementCollection
    private Set<UserRoles> roles;
    private String mail;
    private String phone;
    private String fio;
    private String login;
    private String password;
    private long rating;
    private long coins;

    public void addCoins(long coins) {
        this.coins += coins;
    }
}
