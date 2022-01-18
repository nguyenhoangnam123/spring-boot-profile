package com.namnh.springbootconfig;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class GreetingController {
    @Value("${my.greeting}")
    private String greetingMessage;

    @GetMapping("/greeting")
    public String greeting() {
        return greetingMessage;
    };
}