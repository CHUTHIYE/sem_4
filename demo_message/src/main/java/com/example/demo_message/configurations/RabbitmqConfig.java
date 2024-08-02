package com.example.demo_message.configurations;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;



@Configuration
public class RabbitmqConfig {
    @Value("${rabbitmq.queue.name}")
    public String queueName;
    @Value("${rabbitmq.exchange.name}")
    public String exchangeName;
    @Value("${rabbitmq.routing_key}")
    public String routingKey;

    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    public TopicExchange exchangeName(){
        return new TopicExchange(exchangeName);
    }

    @Bean
    public Binding bindingQueue(){
        return BindingBuilder
                .bind(queue())
                .to(exchangeName())
                .with(routingKey);
    }
}
