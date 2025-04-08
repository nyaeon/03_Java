package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 문자열을 LocalDate, LocalTime, LocalDateTime으로 변환
         */
        String timeNow = "16:23:10";
        String dateNow = "2025-04-04";

        LocalTime localTime = LocalTime.parse(timeNow); // 문자열 → LocalTime 변환
        System.out.println("LocalTime : " + localTime);

        LocalDate localDate = LocalDate.parse(dateNow); // 문자열 → LocalDate 변환
        System.out.println("LocalDate : " + localDate);

        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + localTime); // 문자열 → LocalDateTime 변환
        System.out.println("LocalDateTime : " + localDateTime);

        /*
         * 패턴을 적용한 문자열 변환
         */
        String timeNow2 = "16-23-10"; // "-"로 구분된 시간 문자열
        String dateNow2 = "2025-04-04";

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        System.out.println("LocalTime 2 : " + localTime2);

        // 잘못된 패턴 (yyNNdd) 사용 - 실행 시 예외 발생 가능
        // LocalDate date2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyNNdd"));

        /*
         * LocalDateTime을 문자열로 변환 (포맷 적용)
         */
        String dateFormat = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Date Format : " + dateFormat);

        String timeFormat = localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Time Format : " + timeFormat);
    }
}
