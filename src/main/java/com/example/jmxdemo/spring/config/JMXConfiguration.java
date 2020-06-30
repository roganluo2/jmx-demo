//package com.example.jmxdemo.spring.config;
//
//import com.example.jmxdemo.spring.IJmxTestBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jmx.export.MBeanExporter;
//import org.springframework.jmx.export.annotation.AnnotationJmxAttributeSource;
//import org.springframework.jmx.export.assembler.InterfaceBasedMBeanInfoAssembler;
//import org.springframework.jmx.export.assembler.MBeanInfoAssembler;
//import org.springframework.jmx.export.assembler.MetadataMBeanInfoAssembler;
//import org.springframework.jmx.export.assembler.MethodNameBasedMBeanInfoAssembler;
//import org.springframework.jmx.export.metadata.JmxAttributeSource;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//
//@Configuration
//public class JMXConfiguration {
//
//    @Bean
//    public JmxAttributeSource jmxAttributeSource() {
//        return new AnnotationJmxAttributeSource();
//    }
//
///*    @Bean
//    public MBeanInfoAssembler mBeanInfoAssembler(){
//        MetadataMBeanInfoAssembler metadataMBeanInfoAssembler = new MetadataMBeanInfoAssembler();
//        JmxAttributeSource jmxAttributeSource = jmxAttributeSource();
//        System.out.println("mBeanInfoAssembler :: " + jmxAttributeSource);
//        metadataMBeanInfoAssembler.setAttributeSource(jmxAttributeSource);
//        return metadataMBeanInfoAssembler;
//    }*/
//
//   /* @Bean
//    public MetadataNamingStrategy metadataNamingStrategy(){
//        MetadataNamingStrategy metadataNamingStrategy = new MetadataNamingStrategy();
//        JmxAttributeSource jmxAttributeSource = jmxAttributeSource();
//        System.out.println("metadataNamingStrategy :: " + jmxAttributeSource);
//        metadataNamingStrategy.setAttributeSource(jmxAttributeSource);
//        return metadataNamingStrategy;
//    }*/
//
//  /*  @Bean
//    public MBeanExporter exporter(){
//        MBeanExporter export = new MBeanExporter();
//        export.setAutodetect(true);
//        export.setAssembler(mBeanInfoAssembler());
//        return export;
//    }*/
//
// /*   @Bean
//    public MBeanInfoAssembler mBeanInfoAssembler(){
//        MetadataMBeanInfoAssembler metadataMBeanInfoAssembler = new MetadataMBeanInfoAssembler();
//        metadataMBeanInfoAssembler.setAttributeSource(jmxAttributeSource());
//        return metadataMBeanInfoAssembler;
//    }*/
//
//
//    @Bean
//    public MBeanExporter exporter(IJmxTestBean bean){
//        MBeanExporter export = new MBeanExporter();
//        Map<String, Object> beans = new HashMap<>();
//        beans.put("com.example.jmxdemo.spring.imp:name=annotationTestBean", bean);
//        export.setBeans(beans);
//        export.setAssembler(mBeanInfoAssembler());
//
//        return export;
//    }
//
//   /*  @Bean
//    public MBeanInfoAssembler mBeanInfoAssembler(){
//        InterfaceBasedMBeanInfoAssembler ibmbia = new InterfaceBasedMBeanInfoAssembler();
////        ibmbia.setManagedInterfaces(IJmxTestBean.class);
//         Properties properties = new Properties();
//         properties.put("annotationTestBean","com.example.jmxdemo.spring.IJmxTestBean");
//         ibmbia.setInterfaceMappings(properties);
//        return ibmbia;
//    }
//    */
//
//     @Bean
//     public MBeanInfoAssembler mBeanInfoAssembler(){
//         MethodNameBasedMBeanInfoAssembler ibmbia = new MethodNameBasedMBeanInfoAssembler();
//         ibmbia.setManagedMethods("add","getName","myOperation");
//        return ibmbia;
//    }
//
//
//}
