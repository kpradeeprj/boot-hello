package com.org.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/order/{oid}")
    public String hello(@PathVariable("oid") String oid) {
        System.out.println("hello method");
        return oid+"  Login Time:"+System.currentTimeMillis();
    }
    
    public void m1() {
    	System.out.println("m1() method");
    }

    public void m2() {
        System.out.println("m2() method");
    }
    
    public void m3() {
        System.out.println("m2() method");
    }
    
}
