package com.ylb.demo.spring.boot.mybatis.test;

import com.ylb.demo.spring.boot.mybatis.SpringBootMybatisApplication;
import com.ylb.demo.spring.boot.mybatis.entity.User;
import com.ylb.demo.spring.boot.mybatis.mapper.UserMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


public class MyBatisTests {

    @Autowired
    private UserMapper userMapper;

    public void insert(){
        User user = new User();
        user.setAge((long) 22);
        user.setName("王八蛋");
        user.setUid("1001");
        user.setEmail("12131@qq.com");
        userMapper.insert(user);
    }
}
