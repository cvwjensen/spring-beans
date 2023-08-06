package com.example.springlifecycle.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularB {
//    @Lazy
    @Autowired private CircularA circularA;
}
