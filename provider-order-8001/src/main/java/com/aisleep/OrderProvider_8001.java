package com.aisleep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 启动类
 * EnableEurekaClient 该注解的作用：在服务启动以后自动注册到Eureka服务中
 * EnableDiscoveryClient 服务发现的注解，可以不用配该注解
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class OrderProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(OrderProvider_8001.class, args);
    }
}
