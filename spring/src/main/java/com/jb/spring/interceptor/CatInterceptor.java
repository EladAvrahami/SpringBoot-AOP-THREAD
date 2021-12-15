package com.jb.spring.interceptor;

import com.jb.spring.beans.Cat;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CatInterceptor implements BeanPostProcessor {

    //ביצוע פעולות על פעולות הקונסטרקטור CI
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        //תדפיס את כל שמות מחלקות בין
        /*System.out.println(beanName);
        return bean;*/

        //אם מצא מופע של חתול בשם מיצי תדפיס מצאתי
       /* if(bean instanceof Cat){
            Cat mycat=(Cat)bean;
            if (mycat.getName().equals("Mitzi")){
                System.out.println("found him");
            }
        }
        return bean;*/

        //בדיקה אם גיל 0 תשנה ל10
       if (bean instanceof Cat){//
            Cat myCat = (Cat)bean;
            if (myCat.getAge()==0){
                myCat.setAge(10);
                return myCat;
            }
        }
        return bean;

    }
}
