package com.mood.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mood on 2018/4/9.
 * 定义一个feign接口
 */
@FeignClient(value = "SERVICE-DEMO" ,fallback = SchedualServiceHiHystric.class)
public interface FeignService {
    @RequestMapping("demo/hi")
    public String say(@RequestParam(value = "name") String name);
}
