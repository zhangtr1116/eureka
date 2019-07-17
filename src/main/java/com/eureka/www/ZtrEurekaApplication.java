package com.eureka.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class ZtrEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZtrEurekaApplication.class, args);
	}

}
