package com.example.jmxdemo.spring.config;

import com.example.jmxdemo.spring.IJmxTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.assembler.MBeanInfoAssembler;
import org.springframework.jmx.export.assembler.MethodNameBasedMBeanInfoAssembler;
import org.springframework.jmx.export.naming.KeyNamingStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Configuration
@EnableMBeanExport
public class JMXCustomObjectNameConfiguration {

    /*    @Bean
    public MBeanExporter exporter(IJmxTestBean bean){
        MBeanExporter export = new MBeanExporter();
        Map<String, Object> beans = new HashMap<>();
        beans.put("annotationTestBean", bean);
        export.setBeans(beans);
        export.setNamingStrategy(namingStrategy());
        return export;
    }

    @Bean
    public KeyNamingStrategy namingStrategy(){
        KeyNamingStrategy  namingStrategy = new KeyNamingStrategy();
        Properties properties = new Properties();
        properties.put("annotationTestBean","com.example.jmxdemo.spring.imp:name=AnnotationTestBean");
        namingStrategy.setMappings(properties);
        return namingStrategy;
    }
*/
}
