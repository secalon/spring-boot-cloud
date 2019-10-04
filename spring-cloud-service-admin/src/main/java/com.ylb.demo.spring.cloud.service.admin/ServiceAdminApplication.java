package com.ylb.demo.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceAdminApplication {
    public static void main(String [] arg){
        SpringApplication.run(ServiceAdminApplication.class,arg);
    }
}
