package com.zo.delivery.producer;

import com.zo.delivery.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    @Autowired
    private KafkaTemplate<String, Message> template;

    public void sendOrder(OrderMessage order) {
        template.send("order", order);
    }
}
