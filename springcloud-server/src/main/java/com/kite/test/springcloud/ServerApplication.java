package com.kite.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//springBoot  作为主启动类
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker 
public class ServerApplication {
	
    public static void main(String[] args) {
    	SpringApplication.run(ServerApplication.class, args);
    }
}