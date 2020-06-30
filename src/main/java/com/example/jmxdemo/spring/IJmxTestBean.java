package com.example.jmxdemo.spring;

/**
 * @author rogan.luo
 * @Description TODO
 * @Date 2020/6/29 19:54
 */
public interface IJmxTestBean {
    int getAge();

    void setAge(int age);

    void setName(String name);

    String getName();

    int add(int x, int y);

    void dontExposeMe();
}
