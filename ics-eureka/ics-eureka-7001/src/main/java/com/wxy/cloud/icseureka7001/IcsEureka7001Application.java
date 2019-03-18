package com.wxy.cloud.icseureka7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer //启动该组件的相关注解标签
/**
 * ICS eureka启动类
 *
 * @author wxy
 * @date 2019/03/14
 */
public class IcsEureka7001Application {

	public static void main(String[] args) {
		SpringApplication.run(IcsEureka7001Application.class, args);
	}

}
