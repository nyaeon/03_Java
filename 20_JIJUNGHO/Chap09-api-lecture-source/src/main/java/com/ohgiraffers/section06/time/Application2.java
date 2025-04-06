package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Application2 {
    public static void main(String[] args) {
        // 필드값 확인
        System.out.println("========== localTime ==========");
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        System.out.println("시간 : " + localTime.getHour());
        System.out.println("분 : " + localTime.getMinute());
        System.out.println("초 : " + localTime.getSecond());
        System.out.println("나노 초 : " + localTime.getNano());

        System.out.println("========== localDate ==========");
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("연도 : " + localDate.getYear());
        System.out.println("월 : " + localDate.getMonth());
        System.out.println("월 숫자: " + localDate.getMonthValue());
        System.out.println("월 중에 몇번째 일 : " + localDate.getDayOfMonth());
        System.out.println("일년 중에 몇번째 일 : " + localDate.getDayOfYear());
        System.out.println("한 주의 몇번째 일 : " + localDate.getDayOfWeek());

        System.out.println("========== zonedDateTime ==========");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("zone infomation : " + zonedDateTime.getZone());
        System.out.println("시차 : " + zonedDateTime.getOffset());

    }
}
