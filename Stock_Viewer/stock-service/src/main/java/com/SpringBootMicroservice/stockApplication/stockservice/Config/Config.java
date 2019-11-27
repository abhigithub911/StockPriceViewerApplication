package com.SpringBootMicroservice.stockApplication.stockservice.Config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    //This will do the client side loadbalancing when we are using the eureka service
    //Client side loadbalancing which will resolve the URL
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

