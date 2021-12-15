package com.jb.spring;

import com.jb.spring.beans.*;
import com.jb.spring.interfaces.Mobile;
import com.jb.spring.services.CheckNameService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication   //component scan, configuration scan .....
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		/*
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		//get cat instance with spring
		Cat mitzi = ctx.getBean(Cat.class);

		//di -> Dependency injection
		mitzi.setName("Mitizi");
		mitzi.setAge(15);
		System.out.println(mitzi);

		//ci -> Constructor injection
		Cat kitzi = ctx.getBean(Cat.class,"Pagosh",2,null);
		kitzi.setName("Kitzi");
		System.out.println(kitzi);

		/*
		Mobile dikla = ctx.getBean(Android.class);
		//pojo
		//Mobile dikla2 = new Android();

		dikla.setName("Samsung s21");
		System.out.println(dikla);

		dikla = ctx.getBean(Iphone.class);
		dikla.setName("Iphone 12 max");

		System.out.println(dikla);

		Mobile natan = ctx.getBean("iphone" ,Mobile.class); //primary iphone
		natan.setName("KAJ - Karim Abdul Jabar");
		System.out.println(natan);


*/
		System.out.println("total :"+ CheckNameService.getTotalCounter());

		 /**/
	}
}
