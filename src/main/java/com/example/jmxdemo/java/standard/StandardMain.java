package com.example.jmxdemo.java.standard;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class StandardMain {

    public static void main(String[] args) throws Exception{
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("com.example.jmxdemo.java.standard:type=Hello");
        Hello mbean = new Hello();
        mbs.registerMBean(mbean, name);

        System.out.println("Waiting forever...");
        Thread.sleep(Long.MAX_VALUE);
    }

}
