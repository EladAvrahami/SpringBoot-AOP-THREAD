package com.jb.spring.CLR;

import com.jb.spring.Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
//@Order(2)
public class MyFirstTest implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("My first test");
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

    }
}
