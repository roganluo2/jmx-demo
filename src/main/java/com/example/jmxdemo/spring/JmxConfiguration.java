package com.example.jmxdemo.spring;

import com.example.jmxdemo.spring.impl.JmxTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rogan.luo
 * @Description TODO
 * @Date 2020/6/29 19:55
 */
@Configuration
public class JmxConfiguration {

  /*  @Bean
    public MBeanExporter exporter(JmxTestBean jmxTestBean){
        MBeanExporter exporter = new MBeanExporter();
        Map<String, Object> beans = new HashMap<>();
        beans.put("com.example.jmxdemo.spring.impl:name=testBean1", jmxTestBean);
        exporter.setBeans(beans);
        return exporter;
    }*/

    @Bean
    public MBeanExporter autodetectExporter(JmxTestBean jmxTestBean){
        MBeanExporter exporter = new MBeanExporter();
        exporter.setAutodetect(true);
        return exporter;
    }

}
