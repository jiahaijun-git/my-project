package com.boot.base.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingController {

    @Scheduled(fixedRate = 10000)
    public void test(){
        System.out.println("我本将心向明月，奈何明月照沟渠");
    }
}
