package com.example.demo.domain.sevice;

import com.example.demo.domain.entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IChatService {

    Page<Message> getPage(Pageable pageable);

    void createMessage(Message message);
}
