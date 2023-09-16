package com.learn.kafka.springbootkafka.service;

import com.learn.kafka.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJsonProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonProducer.class);

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User user) {
        Message<User> userMessage = MessageBuilder.withPayload(user)
                .setHeader(KafkaHeaders.TOPIC, "my-first-topic")
                        .build();
        kafkaTemplate.send(userMessage);

        LOGGER.info(String.format("Message sent :: %s", user));
    }

}
