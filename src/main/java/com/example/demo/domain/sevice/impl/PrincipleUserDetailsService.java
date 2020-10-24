package com.example.demo.domain.sevice.impl;

import com.example.demo.domain.entity.PrincipalUserDetails;
import com.example.demo.domain.entity.User;
import com.example.demo.domain.exception.NoFoundUserException;
import com.example.demo.domain.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class PrincipleUserDetailsService implements UserDetailsService {

    private final IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws NoFoundUserException {
        return new PrincipalUserDetails(userRepository
                    .findByLogin(login)
                    .orElseThrow(
                            () -> new NoFoundUserException(
                                    "User with login:" + login + " not found"
                            )
                    )
        );
    }
}
