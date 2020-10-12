package com.example.restAPI.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String HelloWorldEndpoint() {
        return "Greetings from Spring Boot!";
    }

}
