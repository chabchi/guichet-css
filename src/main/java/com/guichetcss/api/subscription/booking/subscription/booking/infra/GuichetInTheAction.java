package com.guichetcss.api.subscription.booking.subscription.booking.infra;

import com.guichetcss.api.subscription.booking.subscription.booking.port.GuichetApplication;
import com.guichetcss.api.subscription.booking.subscription.booking.service.ProducerService;
import com.guichetcss.api.subscription.booking.subscription.booking.domain.Ticket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;

@Component
public class GuichetInTheAction implements GuichetApplication {
    private final Logger logger = LoggerFactory.getLogger(GuichetInTheAction.class);

    private final ProducerService producer;

    public GuichetInTheAction(ProducerService producer) {
        this.producer = producer;
    }


    public boolean purchaseTicket(Ticket ticket) throws  ExecutionException, InterruptedException{
        ListenableFuture<SendResult<String, String>> listenableFuture = this.producer.sendMessage("TICKET-MATCH", ticket.getNumber() , ticket);

        SendResult<String, String> result = listenableFuture.get();
        logger.info(String.format("send message: \nProduced:\ntopic: %s\noffset: %d\npartition: %d\nvalue size: %d", result.getRecordMetadata().topic(),
                result.getRecordMetadata().offset(),
                result.getRecordMetadata().partition(), result.getRecordMetadata().serializedValueSize()));
        return listenableFuture.isDone();
    }
}
