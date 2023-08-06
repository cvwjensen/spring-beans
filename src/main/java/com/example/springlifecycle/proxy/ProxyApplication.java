package com.example.springlifecycle.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@EnableCaching
public class ProxyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ProxyApplication.class, args);
        PrimeService bean = context.getBean(PrimeService.class);
        PrimeServiceProxied beanProxied = context.getBean(PrimeServiceProxied.class);
    }
}
