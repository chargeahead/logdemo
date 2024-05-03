package com.example.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogDemoController {

    Logger logger = LoggerFactory.getLogger(LogdemoApplication.class);

    @GetMapping("/")
    public String sayHello(){
        logger.info("info log from app");
        logger.trace("trace log from app");
        return "Hello from Spring Boot";
    }
}
