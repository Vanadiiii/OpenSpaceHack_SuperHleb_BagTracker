package com.example.demo.domain.impl;

import com.example.demo.domain.IChatDomainService;
import com.example.demo.domain.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class ChatDomainService implements IChatDomainService {
    @Override
    public Page<Message> getMessages(Pageable pageable) {
        return null;
    }

    @Override
    public void createMessage(Message message) {

    }
}
