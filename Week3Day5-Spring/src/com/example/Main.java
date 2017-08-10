package com.example;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //FileSystemXmlApplicationContext - if xml is outside src
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Employee employee = (Employee) context.getBean("emp");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getPhone());

    }
}
