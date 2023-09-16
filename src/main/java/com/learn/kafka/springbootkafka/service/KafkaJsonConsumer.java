package com.learn.kafka.springbootkafka.service;

import com.learn.kafka.springbootkafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaJsonConsumer {

    @KafkaListener(topics = "my-first-topic-json", groupId = "my-group")
    public void consume(User user) {
        log.info(String.format("Json message received %s", user.toString()));
    }
}
