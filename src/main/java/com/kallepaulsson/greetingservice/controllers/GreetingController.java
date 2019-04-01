package com.kallepaulsson.greetingservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class GreetingController {

    @Value("${message}")
    private String message;

    @GetMapping(path = "/greeting", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Map<String, String> getGreeting() {
        return Collections.singletonMap("message", message);
    }
}
