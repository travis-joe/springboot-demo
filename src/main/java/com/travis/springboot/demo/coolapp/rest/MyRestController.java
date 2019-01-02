package com.travis.springboot.demo.coolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MyRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World Time is " + LocalDateTime.now();
    }
}
