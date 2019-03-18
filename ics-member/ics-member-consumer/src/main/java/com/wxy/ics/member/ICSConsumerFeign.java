package com.wxy.ics.member;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 *consumer启动类
 * @author wxy
 * @date 2019/03/14
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.wxy.ics")
@EnableFeignClients(basePackages = {"com.wxy.ics"})
public class IcsConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(IcsConsumerFeign.class,args);
    }
}
