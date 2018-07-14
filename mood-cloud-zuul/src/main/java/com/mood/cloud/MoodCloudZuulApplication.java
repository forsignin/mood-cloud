package com.mood.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class MoodCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoodCloudZuulApplication.class, args);
	}
}
