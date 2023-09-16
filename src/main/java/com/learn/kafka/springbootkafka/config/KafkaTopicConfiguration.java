package com.learn.kafka.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic myTopic() {
        return TopicBuilder.name("my-first-topic")
                .build();
    }

    @Bean
    public NewTopic myTopicJson() {
        return TopicBuilder.name("my-first-topic-json")
                .build();
    }
}
