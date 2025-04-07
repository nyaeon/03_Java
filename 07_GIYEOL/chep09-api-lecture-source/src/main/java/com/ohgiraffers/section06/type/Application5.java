package com.ohgiraffers.section06.type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {
        String timenow = "16:23:10";
        String datenow = "2025-04-04";

        LocalTime localTime = LocalTime.parse(timenow);
        LocalDate date = LocalDate.parse(datenow);
        LocalDateTime localDateTime = LocalDateTime.parse(datenow+"T"+localTime);
        System.out.println(localTime);
        System.out.println(date);
        System.out.println(localTime);

        //페턴 인식
        String timenow2 = "16-23-10";
        String datenow2 = "250404";
        LocalTime localTime2 = LocalTime.parse(timenow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(localTime2);
        LocalDate date2 = LocalDate.parse(datenow2,DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println(date2);

        //time 패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환
        String dateformat = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(dateformat);
        String timeformat = localTime.format(DateTimeFormatter.ofPattern("HHmm"));
        System.out.println(timeformat);


    }
}
