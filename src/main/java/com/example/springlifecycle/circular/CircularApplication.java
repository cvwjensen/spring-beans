package com.example.springlifecycle.circular;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class CircularApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CircularApplication.class, args);
    }
    
}
