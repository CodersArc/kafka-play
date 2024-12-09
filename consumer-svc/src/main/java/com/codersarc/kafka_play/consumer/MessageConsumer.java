package com.codersarc.kafka_play.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private final static String TOPIC_1 = "my-topic-1";

    @KafkaListener(topics = TOPIC_1, groupId = "my-group-id-1")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}