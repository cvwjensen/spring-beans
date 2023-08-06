package com.example.springlifecycle.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    Logger logger = Logger.getLogger(MyBeanPostProcessor.class.getName());
    private AtomicInteger counter = new AtomicInteger(0);
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.startsWith("lifecycleBean")) {
            logger.info("BeforeInitialization = " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        int count = counter.incrementAndGet();
        if (beanName.startsWith("lifecycleBean")) {
            logger.info("Bean #" + count + " READY : " + beanName);
        }
        return bean;
    }
}
