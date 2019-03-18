package com.wxy.ics.admin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * @author wxy
 * @date 2019/03/14
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.wxy.ics"})
@ComponentScan("com.wxy.ics")
public class IcsAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(IcsAdminApplication.class,args);
    }
}
