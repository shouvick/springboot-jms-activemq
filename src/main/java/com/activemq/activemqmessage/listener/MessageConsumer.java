package com.activemq.activemqmessage.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@EnableJms
public class MessageConsumer {

    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "message-queue")
    public void listener(String message) {
        logger.info("Message Received : " + message);
    }
}
