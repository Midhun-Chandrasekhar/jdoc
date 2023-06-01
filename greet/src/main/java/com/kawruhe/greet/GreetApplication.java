package com.kawruhe.greet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApplication.class, args);
	}

}
