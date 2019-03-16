package com.wxy.ics.member;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.wxy.ics")
@EnableFeignClients(basePackages = {"com.wxy.ics"})
public class ICSConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(ICSConsumerFeign.class,args);
    }
}
