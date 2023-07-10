package com.example.PocJmsartemis.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class DispatcherService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Value("${jms.queue}")
    String jmsQueue;
    Logger log = org.slf4j.LoggerFactory.getLogger(DispatcherService.class);

    public void sendMessage(String message){
        log.info("Sending message: " + message);

        jmsTemplate.convertAndSend(jmsQueue, message);
    }
}
