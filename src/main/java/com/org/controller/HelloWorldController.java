package com.org.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/check/{name}")
    public String hello(@PathVariable("name") String name) {
        return "Hello "+name+", Login Time:"+System.currentTimeMillis();
    }
}
