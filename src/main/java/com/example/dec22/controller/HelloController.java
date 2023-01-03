package com.example.dec22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/greet/{name}")
    public String sayHello(@PathVariable("name")String name){
        return "HELLO " +name+ ", WELCOME TO SPRING-BOOT";
    }
}
