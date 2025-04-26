package com.nacos.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author maple
 * @date 2025-04-26
 * @description
 */
@SpringBootApplication
public class NacosStudyApplication {
    public static void main (String[] args) {
        SpringApplication.run(NacosStudyApplication.class, args);
    }
}
