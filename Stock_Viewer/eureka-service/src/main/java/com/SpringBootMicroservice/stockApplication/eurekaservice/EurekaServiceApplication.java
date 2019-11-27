package com.SpringBootMicroservice.stockApplication.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//This is a small spring boot application which is going to behave as a eureka server.
// Once this server is started, there will be a dashboard where we can see which all clients are registered to this server as it is a server registry.
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}

}
