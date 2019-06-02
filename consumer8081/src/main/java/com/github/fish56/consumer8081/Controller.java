package com.github.fish56.consumer8081;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String hello(){
        // 从注册中心找到某个微服务提供者的列表
        List<ServiceInstance> list = discoveryClient.getInstances("PROVIDER8071");

        // 找到微服务对应的url
        ServiceInstance serviceInstance = list.get(0);
        URI uri = serviceInstance.getUri();

        // 发起请求
        return restTemplate.getForObject(uri + "/", String.class);
    }
}
