package com.org.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/order/{oid}")
    public String hello(@PathVariable("oid") String oid) {
        return "Hello : "+oid;
    }
}
