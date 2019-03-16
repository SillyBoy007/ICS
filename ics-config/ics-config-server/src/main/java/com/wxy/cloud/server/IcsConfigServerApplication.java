package com.wxy.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class IcsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IcsConfigServerApplication.class, args);
	}

}