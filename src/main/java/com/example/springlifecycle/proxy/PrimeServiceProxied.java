package com.example.springlifecycle.proxy;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PrimeServiceProxied {
    public PrimeServiceProxied() {
        System.out.println("PrimeService.PrimeService");
    }

    @Cacheable("prime")
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
