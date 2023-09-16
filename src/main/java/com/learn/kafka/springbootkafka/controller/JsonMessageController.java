package com.learn.kafka.springbootkafka.controller;

import com.learn.kafka.springbootkafka.payload.User;
import com.learn.kafka.springbootkafka.service.KafkaJsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class JsonMessageController {

    @Autowired
    private KafkaJsonProducer kafkaJsonProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        kafkaJsonProducer.sendMessage(user);

        return ResponseEntity.ok("Json message sent to kafka topic");
    }

}
