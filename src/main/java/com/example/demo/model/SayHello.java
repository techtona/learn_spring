package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class SayHello {

    public String hello(String name){
        return  "Hello " + name;
    }

}
