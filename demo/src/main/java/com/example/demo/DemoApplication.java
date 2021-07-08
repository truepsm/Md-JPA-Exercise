package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Demo Application
 */
@SpringBootApplication(scanBasePackages = {
        "com.example.demo.controller",
        "com.example.demo.service" })
@EntityScan("com.example.demo.entity")
public class DemoApplication {

    /**
     * main
     *
     * @param args String[]
     */
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

}
