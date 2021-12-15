package com.jb.spring.threads;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync //for enabling async task
@EnableScheduling //enable scheduling
public class RunEverySecond {
    @Async
    @Scheduled(fixedRate = 1000)/*chang time to 1000 for 1 sec or 1000*60*60*24*/
    public void sheldon()  {
        System.out.println("Penny !!!!");
    }

    @Async
    //0 sec , 30 min, 1 hour, day , month , time zone
    @Scheduled(cron = "30 18 16 * * ?",zone="Asia/Jerusalem")
    public void eraseCoupon(){
        //System.out.println("Delete coupon");
        sheldon();
        System.out.println("crone time work");
    }
}
