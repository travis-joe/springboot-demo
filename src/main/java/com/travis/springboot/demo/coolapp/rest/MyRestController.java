package com.travis.springboot.demo.coolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class MyRestController {

    @Value("${coach.name}")
    private String coach;

    @Value("${team.name}")
    private String team;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World Time is " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String workout() {
        return coach + " " +team;
    }


}
