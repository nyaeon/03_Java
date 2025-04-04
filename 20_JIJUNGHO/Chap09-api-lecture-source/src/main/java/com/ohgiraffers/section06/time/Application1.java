package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {

    public static void main(String[] args) {

        // 현재 시간을 조회
        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);

        // 임의로 넣은 시간 값을 조회
        LocalTime timeNow2 = LocalTime.of(16,48,00);
        System.out.println("timeNow2 = " + timeNow2);
        
        // 현재 날짜를 조회
        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);

        // 임의로 넣은 날짜 값을 조회
        LocalDate dateNow2 = LocalDate.of(2025,4,5);
        System.out.println("dateNow2 = " + dateNow2);

        // 현재 지역에 맞는 날짜와 시간 값을 조회
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);

        // 임의로 넣은 값을 조회
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateNow2, timeNow2, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);

    }
}
