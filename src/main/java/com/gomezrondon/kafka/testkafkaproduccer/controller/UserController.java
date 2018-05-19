package com.gomezrondon.kafka.testkafkaproduccer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "test-topic";

    @GetMapping("kafka/{message}")
    public String post(@PathVariable("message") final String message){

        kafkaTemplate.send(TOPIC, message);

        return "Publish successfully "+message;
    }

}
