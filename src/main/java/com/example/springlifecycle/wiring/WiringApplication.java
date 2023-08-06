package com.example.springlifecycle.wiring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class WiringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WiringApplication.class, args);
    }

}
