package com.mood.cloud.controller;

import com.mood.cloud.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mood on 2018/4/8.
 */
@RestController
public class DemoController {
    @Resource
    private  DemoService demoService;
    @RequestMapping("/say")
    public String say(@RequestParam String name){
        return demoService.demoService(name);
    }
}
