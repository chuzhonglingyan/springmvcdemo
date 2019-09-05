package com.yuntian.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Auther: yuntian
 * @Date: 2019/9/1 0001 23:04
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {"com.yuntian.spring"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {


}
