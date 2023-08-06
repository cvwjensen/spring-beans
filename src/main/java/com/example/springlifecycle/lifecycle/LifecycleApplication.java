package com.example.springlifecycle.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class LifecycleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LifecycleApplication.class, args);
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public LifecycleBean lifecycleBean() {
        return new LifecycleBean();
    }
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public LifecycleBean2 lifecycleBean2() {
        return new LifecycleBean2();
    }
    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public LifecycleBean3 lifecycleBean3() {
        return new LifecycleBean3();
    }
}
