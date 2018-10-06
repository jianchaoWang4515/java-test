package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.*")
public class LWApplication {
    public static void main(String[] args) {
        SpringApplication.run(LWApplication.class,args);
    }
}
