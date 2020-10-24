package com.example.demo.domain.impl;

import com.example.demo.domain.IChatDomainService;
import com.example.demo.domain.entity.Message;
import com.example.demo.domain.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatDomainService implements IChatDomainService {

    private final ChatRepository chatRepository;

    @Override
    public Page<Message> getMessages(Pageable pageable) {
        return null;
    }

    @Override
    public void createMessage(Message message) {

    }
}
