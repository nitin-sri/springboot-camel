package com.example.microservices.camel.microservice.producer.routes.file;

import org.apache.camel.builder.RouteBuilder;

//@Component
public class FileRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:files/input")
                .to("file:files/output");

    }
}
