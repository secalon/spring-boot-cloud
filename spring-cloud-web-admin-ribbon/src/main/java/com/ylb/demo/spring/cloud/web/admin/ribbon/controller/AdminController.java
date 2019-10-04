package com.ylb.demo.spring.cloud.web.admin.ribbon.controller;

import com.ylb.demo.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHi(){
        return adminService.sayHi("yyy");
    }
}
