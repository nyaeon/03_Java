package com.ohgiraffers.sectoin06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {


//        String timeNow = "16:23:10";
//        String dateNow = "2025-04-04";
//
//        LocalTime localTime = LocalTime.parse(timeNow);
//        LocalDate date = LocalDate.parse(timeNow);
//        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + localTime);
//        System.out.println(localTime);
//        System.out.println( date);
//        System.out.println( localDateTime);

        // 패턴을 인식
        String timeNow2 = "16-23-10";
        String dateNow2 = "250404";
        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(localTime2);
        LocalTime date2 = (LocalDateTime.(dateNow2, DateTimeFormatter.ofPattern("yyMMdd")));
        System.out.println(date2);

        //time패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환
        String dateFormat = LocalDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("dateFormat = " + dateFormat);
        String timeFormat = localTime2.format(DateTimeFormatter.ofPattern("HH mm"));
        System.out.println("timeFormat = " + timeFormat);
    }
}
