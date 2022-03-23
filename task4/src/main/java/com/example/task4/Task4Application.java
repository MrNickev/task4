package com.example.task4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Task4Application {

    public static void main(String[] args) {
//        var ctx = new AnnotationConfigApplicationContext();
        var ctx = SpringApplication.run(Task4Application.class, args);
        var first = ctx.getBean(SomethingClass.class);
        System.out.println(first.getAll());
    }

}
