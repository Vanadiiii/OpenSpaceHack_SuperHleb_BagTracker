package com.example.demo.web;

import com.example.demo.domain.sevice.IChatService;
import com.example.demo.web.dto.MessageDto;
import com.example.demo.web.mapper.MessageDtoWebMapper;
import com.example.demo.web.mapper.MessageWebMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatController {
    private final IChatService chatService;
    private final MessageWebMapper messageWebMapper;
    private final MessageDtoWebMapper messageDtoWebMapper;

    @GetMapping
    public ResponseEntity<Page<MessageDto>> getMessages(Pageable pageable){
        return ResponseEntity.ok(chatService.getPage(pageable).map(messageWebMapper));
    }

    @PostMapping
    public ResponseEntity<Void> postMessage(MessageDto message){
        chatService.createMessage(messageDtoWebMapper.apply(message));
        return ResponseEntity.ok().build();
    }
}
