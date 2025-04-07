package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {

    public static void main(String[] args) {

        // 필드값 확인
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        System.out.println("시간 : " + localTime.getHour());
        System.out.println("분 : " + localTime.getMinute());
        System.out.println("초 : " + localTime.getSecond());
        System.out.println("나노초 : " + localTime.getNano());

        LocalDate date = LocalDate.now();
        System.out.println("date = " + date);
        System.out.println("년 : " + date.getYear());
        System.out.println("월 : " + date.getMonth());
        System.out.println("월 숫자 : " + date.getMonthValue());
        System.out.println("1년 중에 몇 번째 일 : " + date.getDayOfMonth());
        System.out.println("한 주의 몇 번째 일 : " + date.getDayOfWeek());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("Zone information : " + zonedDateTime.getZone());
        System.out.println("시차 : " + zonedDateTime.getOffset());



    }
}
