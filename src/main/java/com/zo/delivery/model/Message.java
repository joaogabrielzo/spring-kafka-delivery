package com.zo.delivery.model;

import lombok.Value;

import java.time.LocalDateTime;

public class Message {

    private String sender;
    private String content;
    private final String timestamp = LocalDateTime.now().toString();

}
