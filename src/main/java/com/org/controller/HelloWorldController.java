package com.org.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("id") String name) {
        return "Hello :"+name;
    }
    
    public void m1() {
    	System.out.println("m1() method");
    }
}
