package com.ohgiraffers.sectoin06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Applicatin1 {
    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNow2 = LocalTime.of(16, 48, 20);
        //시 분 초 만 쓰고 싶은 경우 LocalTime을 사용한다. 
        System.out.println("timeNow = " + timeNow);
        System.out.println("timeNow2 = " + timeNow2);
        
        LocalDate dateNow = LocalDate.now();
        LocalDate dateNow2 = LocalDate.of(2025, 4, 5);
        System.out.println("dateNow = " + dateNow2);
        System.out.println("dateNow2 = " + dateNow2);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
        ZonedDateTime zonedDateTimeOf =
                ZonedDateTime.of(dateNow2,timeNow2, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);


    }
}
