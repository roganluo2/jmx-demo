package com.example.jmxdemo.spring;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;

public interface IJmxTestBean {
    @ManagedAttribute(description="The Age Attribute", currencyTimeLimit=15)
    int getAge();

    void setAge(int age);

    @ManagedAttribute(description="The Name Attribute",
            currencyTimeLimit=20,
            defaultValue="bar",
            persistPolicy="OnUpdate")
    void setName(String name);

    @ManagedAttribute(defaultValue="foo", persistPeriod=300)
    String getName();

    @ManagedOperation(description="Add two numbers")
    @ManagedOperationParameters({
            @ManagedOperationParameter(name = "x", description = "The first number"),
            @ManagedOperationParameter(name = "y", description = "The second number")})
    int add(int x, int y);

    void dontExposeMe();
}
