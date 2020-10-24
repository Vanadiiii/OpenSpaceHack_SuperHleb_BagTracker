package com.example.demo.domain.repository;

import com.example.demo.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository<User, UUID> {

}
