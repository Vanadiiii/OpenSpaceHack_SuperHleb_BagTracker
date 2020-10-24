package com.example.demo.domain.entity;

import com.example.demo.enums.UserRoles;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public class Authority implements GrantedAuthority {

    private final UserRoles role;

    @Override
    public String getAuthority() {
        return role.getValue();
    }
}
