package com.mood.cloud.controller;

import com.mood.cloud.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mood on 2018/4/9.
 */
@RestController
public class FeignController {
    @Resource
    private FeignService feignService;
    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(@RequestParam String name){
        return feignService.say(name);
    }
}
