package com.example.message_rabbitmq_consumer.services;

import com.example.message_rabbitmq_consumer.entity.MessageUser;

import java.util.List;
import java.util.Optional;

public interface IMessageUserSevice {
    List<MessageUser> getAllMessageUsers();
    Optional<MessageUser> getMessageUserbyId(int id);
    void addMessageUser(MessageUser messageUser);
    void updateMessageUser(MessageUser messageUser);
    void deleteMessageUser(int id);

}
