package com.zo.delivery.api;

import com.zo.delivery.model.*;
import com.zo.delivery.producer.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;

@RestController
public class OrderController {

    @Autowired
    private OrderProducer orderProducer;

    @PostMapping(value = "/api/order", consumes = "application/json", produces = "application/json")
    public void makeOrder(@RequestBody OrderMessage order) {

        orderProducer.sendOrder(order);
    }

}
