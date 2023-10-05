package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "parasol", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: "+ data);
    }
}
