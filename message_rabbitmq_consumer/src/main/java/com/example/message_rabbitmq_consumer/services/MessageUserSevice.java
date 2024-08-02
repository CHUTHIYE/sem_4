package com.example.message_rabbitmq_consumer.services;

import com.example.message_rabbitmq_consumer.dao.IMessagaUserRepository;
import com.example.message_rabbitmq_consumer.entity.MessageUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageUserSevice implements IMessageUserSevice{
    private final IMessagaUserRepository messagaUserRepository;

    @Autowired
    public MessageUserSevice(IMessagaUserRepository messagaUserRepository) {
        this.messagaUserRepository = messagaUserRepository;
    }

    @Override
    public List<MessageUser> getAllMessageUsers() {
        return List.of();
    }

    @Override
    public Optional<MessageUser> getMessageUserbyId(int id) {
        return Optional.empty();
    }

    @Override
    public void addMessageUser(MessageUser messageUser) {
//        this.messagaUserRepository.
    }

    @Override
    public void updateMessageUser(MessageUser messageUser) {

    }

    @Override
    public void deleteMessageUser(int id) {

    }
}
