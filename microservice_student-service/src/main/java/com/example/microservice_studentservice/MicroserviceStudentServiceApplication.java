package com.example.microservice_studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceStudentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceStudentServiceApplication.class, args);
    }

}
