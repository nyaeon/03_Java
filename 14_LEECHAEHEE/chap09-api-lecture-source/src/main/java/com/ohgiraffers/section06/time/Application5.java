package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {
        String timeNow = "16:23:10";
        String dateNow = "2025-04-04";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate date = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);
        System.out.println(localTime);
        System.out.println(date);
        System.out.println(localDateTime);

        //패턴을 인식
        String timeNow2 = "16-23-10";
        String dateNow2 = "250404";
        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println(localTime2);
        LocalDate date2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));
        System.out.println(date2);

        //time패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환
        String dataFormat = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("dataFormat : " + dataFormat);
        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("timeFormat : " + timeFormat);

    }
}
