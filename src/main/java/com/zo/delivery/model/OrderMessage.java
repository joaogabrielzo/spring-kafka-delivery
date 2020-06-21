package com.zo.delivery.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class OrderMessage extends Message {

    String sender;
    String content;
    UUID orderId = UUID.randomUUID();
    String timestamp = LocalDateTime.now().toString();

}
