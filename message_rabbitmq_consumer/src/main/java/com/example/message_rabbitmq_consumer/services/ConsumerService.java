package com.example.message_rabbitmq_consumer.services;

import com.example.message_rabbitmq_consumer.entity.MessageUser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @RabbitListener(queues = "messageQueue")
    public void consume(String content) {
        System.out.print("Message received: " + content);
        ObjectMapper mapper = new ObjectMapper();

        try {
            MessageUser obj = mapper.readValue(content, MessageUser.class);
            System.out.println(obj.getName());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}
