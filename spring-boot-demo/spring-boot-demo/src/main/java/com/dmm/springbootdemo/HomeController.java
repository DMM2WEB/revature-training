package com.dmm.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String hello() {
        return "Hello Spring Boot Demo!";
    }
}
