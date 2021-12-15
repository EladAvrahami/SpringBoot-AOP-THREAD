package com.jb.spring.AOP;

import com.jb.spring.services.CheckNameService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
@RequiredArgsConstructor/*על מנת לאתחל את הFinal*/
public class NameAspect {

    //@Autowired  //circular dependency problem
    final private CheckNameService checkNameService;
    @After("@annotation(CheckName)")/*שיעבוד אחרי שעשיתי משהו שיפעיל לי את האנוטציה*/
    public void sendNameAlert(){
        checkNameService.checkCatName();
    }/*לאחר שנתקל באנוטציה למעלה תפעיל לי את המתודה הנך שתקרא לסרביס*/

    /*
    @Autowired
    public NameAspect(CheckNameService checkNameService) {
        this.checkNameService = checkNameService;
    }
    */
}
