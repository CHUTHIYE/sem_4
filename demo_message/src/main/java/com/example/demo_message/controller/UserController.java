package com.example.demo_message.controller;

import com.example.demo_message.entity.MessageUser;
import com.example.demo_message.services.MessagingService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final MessagingService messagingService;

    @Autowired
    public UserController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

//    @GetMapping("/list")
//    public List<MessageUser> getUsers() {
//        MessageUser messageUser = new MessageUser();
//
//    }

    @PostMapping("/user")
    public String sendMessage(@RequestBody MessageUser messageUser) {

        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(messageUser);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        this.messagingService.sendMessage(json);


        return "Message sent successfully";

    }
}
