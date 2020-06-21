package com.zo.delivery.consumer;

import com.zo.delivery.model.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DriverConsumer {

    @Autowired
    private KafkaTemplate<String, Message> template;

    private static final Logger LOG = LoggerFactory.getLogger(DriverConsumer.class);

    @KafkaListener(topics = "order")
    public void consumer(@Payload OrderMessage orderMessage) {

        LOG.info("Got message: \n" + orderMessage.toString());

        UUID orderId = orderMessage.getOrderId();

        DeliveryMessage deliveryMessage = new DeliveryMessage();
        deliveryMessage.setOrderId(orderId);
        deliveryMessage.setContent("The order " + orderId + " is on it's way to " + orderMessage.getSender() + "'s house.");

        template.send("delivery", deliveryMessage);
    }
}
