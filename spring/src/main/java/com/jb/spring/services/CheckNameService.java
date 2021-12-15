package com.jb.spring.services;

import org.springframework.stereotype.Service;

@Service
public class CheckNameService {
    private static int totalCounter=0;
    public void checkCatName(){
        System.out.println("Please change the name !!!!");
        totalCounter+=1;
    }

    public static int getTotalCounter(){
        return totalCounter;
    }
}
