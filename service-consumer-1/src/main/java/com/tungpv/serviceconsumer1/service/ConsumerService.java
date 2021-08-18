package com.tungpv.serviceconsumer1.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) {
        log.info(String.format("#### -> Received a message from topic -> message = %s", message));
    }

}
