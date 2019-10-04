package com.ylb.demo.spring.cloud.web.admin.feign.service;

import com.ylb.demo.spring.cloud.web.admin.feign.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHi();
}
