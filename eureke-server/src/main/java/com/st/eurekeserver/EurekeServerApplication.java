package com.st.eurekeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * 1.配置eureka
 * 2.注解
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekeServerApplication.class, args);
    }
}
