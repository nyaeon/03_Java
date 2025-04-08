package com.ohgiraffers.section06.type;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Appcation2 {
    public static void main(String[] args) {
        //필드값 확인
        Calendar cal = Calendar.getInstance();
        LocalTime localtime = LocalTime.now();
        System.out.println("지역 시간 : " + localtime);
        System.out.println("시간 : " + localtime.getHour());
        System.out.println("분 : " + localtime.getMinute());
        System.out.println("초 : " + localtime.getSecond());
        System.out.println("나노초 : " + localtime.getNano());

        LocalDate date = LocalDate.now();
        System.out.println("date : " + date);
        System.out.println("년 : " + date.getYear());
        System.out.println("월 : " + date.getMonth());
        System.out.println("월 숫자 : " + date.getMonthValue());
        System.out.println("월 중에 몇 번째 : " + date.getDayOfMonth());
        System.out.println("1년 중에 몇 번째 일: " + date.getDayOfYear());
        System.out.println("한 주에 몇 번째 일 : " + date.getDayOfWeek());
        System.out.println("한 주에 몇 번째 일 숫자 : " + date.getDayOfWeek().getValue());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("지역 시간 : " + zonedDateTime);
        System.out.println("지역 정보 : " + zonedDateTime.getZone());
        System.out.println("시차 : " + zonedDateTime.getOffset());

    }
}
