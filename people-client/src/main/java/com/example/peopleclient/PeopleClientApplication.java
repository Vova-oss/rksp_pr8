package com.example.peopleclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PeopleClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeopleClientApplication.class, args);
    }

}
