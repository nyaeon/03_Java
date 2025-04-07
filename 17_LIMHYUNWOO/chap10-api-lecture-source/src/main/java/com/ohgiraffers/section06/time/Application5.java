package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {
        String timenow = "16:23:10";
        String dateNow = "2025-04-04";

        LocalTime localTime = LocalTime.parse(timenow);
        LocalDate date = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + localTime);
        System.out.println(localTime);
        System.out.println(date);
        System.out.println(localDateTime);
        System.out.println("===================================");
        //패턴을 인식
        String timeNow2 = "16-23-10";
        String dateNow2 = "250404";
        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(localTime2);
        LocalDate date2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println(dateNow2);

        // time 패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환
        System.out.println(localDateTime);
        String dateFormat = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("dateFormat = " + dateFormat);
        System.out.println(localTime);
        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH mm"));
        System.out.println("timeFormat = " + timeFormat);


    }
}
