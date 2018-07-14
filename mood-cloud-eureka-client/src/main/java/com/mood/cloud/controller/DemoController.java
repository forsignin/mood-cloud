package com.mood.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mood on 2018/4/8.
 */
@RestController
@RequestMapping("demo")
public class DemoController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("hi")
    public String sayHello(@RequestParam String name){
        return "hi "+name+" !!!"+port;
    }
}
