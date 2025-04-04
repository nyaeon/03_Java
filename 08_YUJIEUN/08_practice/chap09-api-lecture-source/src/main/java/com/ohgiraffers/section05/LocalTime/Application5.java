package com.ohgiraffers.section05.LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application5 {

    public static void main(String[] args) {

        String timeNow =  "16:23:10";
        String  dateNow ="2025 -04-03";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate date = LocalDate.parse(dateNow);
        LocalDateTime localDateTime= LocalDateTime.parse(dateNow+ "T"+localTime);
        System.out.println(localTime);
        System.out.println(date);
        System.out.println(localDateTime);



        String timeNow2 =  "16-23-10";
        String dateNow2="250403";

        //this 패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환
        
    }
}
