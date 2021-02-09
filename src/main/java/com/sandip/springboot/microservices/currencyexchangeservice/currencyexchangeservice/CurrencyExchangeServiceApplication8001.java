package com.sandip.springboot.microservices.currencyexchangeservice.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
public class CurrencyExchangeServiceApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeServiceApplication8001.class, args);
    }

}
