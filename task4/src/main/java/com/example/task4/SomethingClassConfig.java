package com.example.task4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;

@Configuration
public class SomethingClassConfig {


    @Profile("test")
    @Bean
    public SomethingClass somethingClassTestParams() {
        return new SomethingClass(71117);
    }

    @Profile("dev")
    @Bean
    public SomethingClass somethingClassDevParams() {
        return new SomethingClass(71118);
    }

    @Profile("prod")
    @Bean
    public SomethingClass somethingClassProdParams() {
        return new SomethingClass(71119);
    }

    @Bean
    @ConditionalOnBean(name = "somethingClassTestParams")
    public void printMessage() {
        System.out.println("SomethingClass object was created in test profile");
    }

    @Bean
    @ConditionalOnProperty(value = "spring.env", havingValue = "test", matchIfMissing = true)
    public void printEnv() {
        System.out.println("Bean without default env");
    }
}
