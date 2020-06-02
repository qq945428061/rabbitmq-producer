package com.example.rabbitmqdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable String id){
        if(id!=null){
            return "hello!!!!!"+id;
        }
        return "hello?";
    }

}
