package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChatRepository extends JpaRepository<Message, UUID> {
}
