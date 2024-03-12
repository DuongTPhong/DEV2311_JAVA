package com.vn.devmaster.service.demo;

import com.vn.devmaster.service.demo.demodepependency_demo.Employee;
import com.vn.devmaster.service.demo.sql.Connect;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        Employee employee = context.getBean(Employee.class);
//        employee.getPerson().wear();
//
//        Connect connect = context.getBean(Connect.class);
//        connect.getiSql().connect();
    }
}
