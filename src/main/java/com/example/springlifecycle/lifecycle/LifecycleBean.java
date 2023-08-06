package com.example.springlifecycle.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.logging.Logger;

public class LifecycleBean implements BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean, BeanFactoryAware {
    Logger logger = Logger.getLogger(LifecycleBean.class.getName());


    public LifecycleBean() {
        logger.info("01 Instantiate LifecycleBean");
    }

    @Override
    public void setBeanName(String name) {
        logger.info("02 LifecycleBean.setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("03 LifecycleBean.setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        logger.info("04 LifecycleBean.setApplicationContext");
    }



    @PostConstruct
    public void postConstruct() {
        logger.info("05 LifecycleBean.postConstruct");
    }

    @Override
    public void afterPropertiesSet() {
        logger.info("05 LifecycleBean.afterPropertiesSet");
    }

    public void initMethod() {
        logger.info("05 LifecycleBean.initMethod");
    }



    @PreDestroy
    public void preDestroy() {
        System.out.println("06 LifecycleBean1.preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("06 LifecycleBean1.destroy");
    }

    public void destroyMethod() {
        System.out.println("06 LifecycleBean1.destroyMethod");
    }

}
