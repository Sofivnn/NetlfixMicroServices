package com.m09.WebServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WebServiceExample {
    @GetMapping("/")
    public String sayHello(){
        return "Hello !";
    }
}