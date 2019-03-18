package com.wxy.ics.member;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


import java.time.LocalDate;
import java.time.LocalTime;

/**
 *启动类
 * @author wxy
 * @date 2019/03/14
 */
@SpringBootApplication(scanBasePackages = {"com.wxy.ics.*"})
@MapperScan("com.wxy.ics.*.mapper")
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.wxy.ics.*"})
public class IcsMemberApplication {

    private static Logger log = LoggerFactory.getLogger(IcsMemberApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(IcsMemberApplication.class, args);
        log.info("《《《《《《 ICS started up successfully at {} {} 》》》》》》", LocalDate.now(), LocalTime.now());
    }
}