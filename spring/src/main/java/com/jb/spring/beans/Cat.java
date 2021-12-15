package com.jb.spring.beans;

import com.jb.spring.AOP.CheckName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component          //to handle the class with spring frame work
@Data               //toString, hash, equal, getters & setters
@AllArgsConstructor //c'tor with all argument
@NoArgsConstructor  //default c'tor
//all classes in spring boot is singleton
@Scope ("prototype") //make it composed (not singleton)  //lazy

public class Cat {
    //@Value("Mitzi")      //value (hard coded)
    private String name; //cat name
    //@Value("${age}")     //value (hard coded) from application.properties file...
    private int age;     //cat age
    @Autowired
    private Chip chip;

    @CheckName/*על הסטר נפעיל את האנוטציה -כל פעם שהסטר יפעל האנוטציה תופעל באמצעות הASPECT שקורה לפעולה בסרביס */
    public void setName(String name) {
        this.name = name;
    }
}
