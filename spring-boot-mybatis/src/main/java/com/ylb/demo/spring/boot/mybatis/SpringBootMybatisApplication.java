package com.ylb.demo.spring.boot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ylb.demo.spring.boot.mybatis.mapper")
public class SpringBootMybatisApplication {
    public static void main(String [] args){
        SpringApplication.run(SpringBootMybatisApplication.class,args);
    }
}
