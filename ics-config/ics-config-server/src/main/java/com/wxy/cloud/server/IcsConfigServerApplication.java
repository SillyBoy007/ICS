package com.wxy.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SuppressWarnings("ALL")
@SpringBootApplication
@EnableConfigServer
/**
 * ICS config启动类
 *
 * @author wxy
 * @date 2019/03/14
 */


public class IcsConfigServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(IcsConfigServerApplication.class, args);
	}

}
