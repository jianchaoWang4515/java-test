package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@ComponentScan(value = "com.*")
public class LWApplication {
    public static void main(String[] args) {
        SpringApplication.run(LWApplication.class,args);
    }
}
