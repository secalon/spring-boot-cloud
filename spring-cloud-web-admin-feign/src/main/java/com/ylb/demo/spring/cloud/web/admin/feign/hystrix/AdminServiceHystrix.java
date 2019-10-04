package com.ylb.demo.spring.cloud.web.admin.feign.hystrix;

import com.ylb.demo.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi() {
        return "请求出错，熔断器生效 hystrix";
    }
}
