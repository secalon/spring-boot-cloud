package com.ylb.demo.spring.cloud.web.admin.ribbon.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
    @Bean
    @LoadBalanced//负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
