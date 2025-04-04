package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {

        String timeNow = "16:23:10";
        String dateNow = "2025-04-04";

        // 문자열이 LocalTime 객체로 변경
        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse((dateNow + "T" + localTime));
        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);

        // 날짜를 문자열로 반환
        // 패턴을 인식
        String timeNow2 = "16-23-10";
        String dateNow2 = "250404";

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(localTime2);
        LocalDate date2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println(date2);

        // time 패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환
        String dateFormat = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(dateFormat);
        String timeFormat = localTime2.format(DateTimeFormatter.ofPattern("HH/mm/ss"));
        System.out.println(timeFormat);



    }
}