package com.jb.spring.AOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//where the annotation will work
@Target({ElementType.TYPE,ElementType.METHOD})
//when the annotation will work
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckName {
}
