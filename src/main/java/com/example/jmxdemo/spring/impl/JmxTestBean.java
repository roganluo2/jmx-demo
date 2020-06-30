package com.example.jmxdemo.spring.impl;

import com.example.jmxdemo.spring.IJmxTestBean;
import org.springframework.stereotype.Component;

/**
 * @author rogan.luo
 * @Description
 * @Date 2020/6/29 19:51
 */
@Component("jmxTestBean:mbean=true")
public class JmxTestBean implements IJmxTestBean {

    private String name = "TEST";
    private int age = 100;
    private boolean isSuperman;

    @Override public int getAge() {
        return age;
    }

    @Override public void setAge(int age) {
        this.age = age;
    }

    @Override public void setName(String name) {
        this.name = name;
    }

    @Override public String getName() {
        return name;
    }

    @Override public int add(int x, int y) {
        return x + y;
    }

    @Override public void dontExposeMe() {
        throw new RuntimeException();
    }
}
