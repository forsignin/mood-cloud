package com.mood.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by mood on 2018/4/8.
 */
@Service
public class DemoService {
    @Resource
    private RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "demoError")
    public String demoService(String name){
        return restTemplate.getForObject("http://SERVICE-DEMO/demo/hi?name="+name.toString(),String.class);
    }
    public String demoError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
