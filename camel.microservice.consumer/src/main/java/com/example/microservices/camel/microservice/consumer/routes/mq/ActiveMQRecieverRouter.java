package com.example.microservices.camel.microservice.consumer.routes.mq;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQRecieverRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:my-activemq-queue")
                .to("log:received-message-from-active-mq");

    }
}
