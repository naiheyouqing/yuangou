package com.yuangou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain18000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain18000.class, args);
    }

}
