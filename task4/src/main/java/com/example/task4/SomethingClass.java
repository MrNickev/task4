package com.example.task4;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class SomethingClass {
    @Value("${spring.appname}")
    private String appname;
    private int somethingParameter;

    @Value("${spring.list}")
    private List<String> list;

    SomethingClass(int somethingParameter) {
        this.somethingParameter = somethingParameter;
    }

    public void changeName(String name) {
        this.appname = name;
    }

    public String getAll() {
        var str = appname + " ";
        for (var i : list)
            str += i + " ";
        str += somethingParameter;
        return str;
    }
}
