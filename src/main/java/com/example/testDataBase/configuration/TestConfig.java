package com.example.testDataBase.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Value("${my.param1}")
    private String p;
    @Bean
    public String param1() {
        System.out.println("p="+p);
        return p;
    }
}
