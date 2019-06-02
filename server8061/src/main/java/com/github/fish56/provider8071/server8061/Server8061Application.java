package com.github.fish56.provider8071.server8061;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Server8061Application {
    public static void main(String[] args) {
        SpringApplication.run(Server8061Application.class, args);
    }
}
