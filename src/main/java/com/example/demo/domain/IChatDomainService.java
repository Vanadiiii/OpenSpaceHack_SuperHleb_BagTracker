package com.example.demo.domain;


import com.example.demo.domain.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IChatDomainService {

    Page<Message> getMessages(Pageable pageable);

    void createMessage(Message message);
}
