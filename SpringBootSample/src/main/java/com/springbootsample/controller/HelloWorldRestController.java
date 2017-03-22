package com.springbootsample.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class HelloWorldRestController {

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldRestController.class, args);
    }

}
