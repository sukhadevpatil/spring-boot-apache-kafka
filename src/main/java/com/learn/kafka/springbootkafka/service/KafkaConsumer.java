package com.learn.kafka.springbootkafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "my-first-topic", groupId = "my-group")
    public void consumer(String message) {
        LOGGER.info(String.format("Message read from the topic is :: %s", message));
    }
}
