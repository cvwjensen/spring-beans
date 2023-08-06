package com.example.springlifecycle.wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceB implements IService {
    @Autowired
//    @Qualifier("serviceA")
    IService service;
}
