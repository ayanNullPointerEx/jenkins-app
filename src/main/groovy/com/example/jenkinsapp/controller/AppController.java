package com.example.jenkinsapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World !!";
    }
}
