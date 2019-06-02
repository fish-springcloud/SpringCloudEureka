package com.github.fish56.provider8071;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @EnableDiscoveryClient
 *   自动的将当前服务注册到Eureka服务中心
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Provider8071Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8071Application.class, args);
    }
}
