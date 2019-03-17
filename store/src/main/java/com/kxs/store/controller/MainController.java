package com.kxs.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/error/{num}")
    public String error(@PathVariable Integer num) throws Exception{
//        throw new RuntimeException();
        int i = 100 / num;
        return i + "";
    }
}
