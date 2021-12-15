package com.jb.spring.CLR;

import com.jb.spring.beans.Eyal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class MyFinalTest implements CommandLineRunner {
    @Autowired
    Eyal eyal;
    @Override
    public void run(String... args) throws Exception {
        System.out.println(" CommandLineRunner 3!!");
    }
}
