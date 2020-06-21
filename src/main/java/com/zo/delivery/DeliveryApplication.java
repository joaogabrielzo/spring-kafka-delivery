package com.zo.delivery;

import com.zo.delivery.configs.ConsumerConfiguration;
import com.zo.delivery.model.OrderMessage;
import org.apache.kafka.clients.consumer.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryApplication.class, args);

    }

}
