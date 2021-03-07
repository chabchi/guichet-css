package com.guichetcss.api.subscription.booking.service;

import com.guichetcss.api.subscription.booking.domain.Ticket;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
@SuppressWarnings("SpringJavaInjectionAutowiringInspection")
public class ProducerService {
    public KafkaTemplate<String, String> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public ListenableFuture<SendResult<String, String>> sendMessage(String topic, String key, Ticket message) {

        return this.kafkaTemplate.send(topic, key, message.toString());
    }
}

