package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static java.util.logging.Level.parse;

public class Applicaiton5 {

    public static void main(String[] args) {
        String timeNow = "16:23:10";
        String dateNow = "2025-04-04";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate date = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + localTime);

        // 패턴을 인식
        String timeNow2 = "16-23-10";
        String dateNow2 = "250404";

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println(localTime2);
        LocalDate data2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyMMdd"));

        // time패키지가 인식한 날짜 및 시간을 원하는 문자열로 반환
        String dateFormat = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("dateFormat : " + dateFormat);
        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.println("timeFormat = " + timeFormat);
    }
}
