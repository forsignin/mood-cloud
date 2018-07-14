package com.mood.cloud.service;

import org.springframework.stereotype.Component;

/**
 * Created by mood on 2018/4/9.
 */
@Component
public class SchedualServiceHiHystric implements FeignService {


    @Override
    public String say(String name) {
        return "wrong";
    }
}