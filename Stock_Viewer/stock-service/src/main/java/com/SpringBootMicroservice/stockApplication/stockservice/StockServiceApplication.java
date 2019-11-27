package com.SpringBootMicroservice.stockApplication.stockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//This annotation will make this as a client and you don't have to do anything else to make this service act as a client.
// The annotation does all the work.
//Spring says you just add the annotation, I'll take care of registering and discovery
@EnableEurekaClient
@SpringBootApplication
public class StockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
	}

}
