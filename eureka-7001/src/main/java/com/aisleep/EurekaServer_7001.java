package com.aisleep;

@SpringBootApplication
@EnableEurekaServer //该注解表示服务端启动类，可以接受别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
