package com.yuntian.web;

import com.yuntian.spring.config.RootConfig;
import com.yuntian.spring.config.WebConfig;
import com.yuntian.spring.repository.UserRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: yuntian
 * @Date: 2019/9/1 0001 22:54
 * @Description:
 */
@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})//需要注意此处，将加载配置文件的注解换成加载配置类的注解
public class ServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void  test(){
        System.out.println( userRepository.getUser(1).toString());
        System.out.println( userRepository.getUser(1).toString());
    }
}
