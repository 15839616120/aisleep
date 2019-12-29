package com.aisleep;

/**
 * 启动之后访问http://localhost:7001/就可以找到服务监控页面
 */
@SpringBootApplication
@EnableEurekaServer //该注解表示服务端启动类，可以接受别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
