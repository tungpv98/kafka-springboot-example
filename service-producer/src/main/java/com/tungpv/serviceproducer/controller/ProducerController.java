package com.tungpv.serviceproducer.controller;

import com.tungpv.serviceproducer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping(value = "/send")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        producerService.sendMessage(message);
    }
}
