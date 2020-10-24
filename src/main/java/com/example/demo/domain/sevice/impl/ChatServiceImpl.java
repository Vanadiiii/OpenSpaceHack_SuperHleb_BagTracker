package com.example.demo.domain.sevice.impl;

import com.example.demo.domain.IChatDomainService;
import com.example.demo.domain.entity.Message;
import com.example.demo.domain.sevice.IChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements IChatService {
    private final IChatDomainService chatDomainService;

    @Override
    public Page<Message> getPage(Pageable pageable) {
        return chatDomainService.getMessages(pageable);
    }

    @Override
    public void createMessage(Message message) {
        chatDomainService.createMessage(message);
    }
}
