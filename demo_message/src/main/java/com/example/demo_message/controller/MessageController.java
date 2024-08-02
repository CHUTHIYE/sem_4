package com.example.demo_message.controller;

import com.example.demo_message.entity.MessageEntity;
import com.example.demo_message.services.MessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    private final MessagingService messagingService;
    @Autowired
    public MessageController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }
    @PostMapping("/message")
    public void sendMessagingService( @RequestBody MessageEntity message) {
        this.messagingService.sendMessage(message.getMessage());
    }
}

