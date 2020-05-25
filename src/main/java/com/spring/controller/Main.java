package com.spring.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext context =
//                new FileSystemXmlApplicationContext("E:/com.spring.test/src/main/resources/Beans.xml");
        Test1 objA = (Test1) context.getBean("test1");
//        objA.setMessage("this is test A");
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        Test obj = (Test) factory.getBean("test");
        objA.getMessage();
        objA.getMsg1();
        Test2 objB = (Test2) context.getBean("test2");
        objB.getMessage();
        objB.getMsg1();
        objB.getMsg2();
//        context.registerShutdownHook();

    }
}
 