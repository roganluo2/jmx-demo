package com.example.jmxdemo.spring.impl;

import com.example.jmxdemo.spring.IJmxTestBean;
import org.springframework.jmx.export.annotation.*;
import org.springframework.stereotype.Component;

@ManagedResource(
        objectName="com.example.jmxdemo.spring.imp:name=AnnotationTestBean",
        description="My Managed Bean",
        log=true,
        logFile="jmx.log",
        currencyTimeLimit=15,
        persistPolicy="OnUpdate",
        persistPeriod=200,
        persistLocation="foo",
        persistName="bar")
@Component
public class AnnotationTestBean implements IJmxTestBean {

    private String name;


    private int age;

    @Override
    @ManagedAttribute(description="The Age Attribute", defaultValue = "10", currencyTimeLimit=15)
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    @ManagedAttribute(description="The Name Attribute",
            currencyTimeLimit=20,
            defaultValue="bar",
            persistPolicy="OnUpdate")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @ManagedAttribute(defaultValue="foo", persistPeriod=300)
    public String getName() {
        return name;
    }

    @Override
    @ManagedOperation(description="Add two numbers")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "x", description = "The first number"),
            @ManagedOperationParameter(name = "y", description = "The second number")})
    public int add(int x, int y) {
        return x + y;
    }

    public void dontExposeMe() {
        throw new RuntimeException();
    }
}
