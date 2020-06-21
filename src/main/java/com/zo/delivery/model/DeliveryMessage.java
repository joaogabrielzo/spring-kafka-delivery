package com.zo.delivery.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class DeliveryMessage extends Message {

    UUID orderId;
    String content;
    String timestamp = LocalDateTime.now().toString();

}
