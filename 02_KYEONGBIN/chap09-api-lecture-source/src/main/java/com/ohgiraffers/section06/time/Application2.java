package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {

    public static void main(String[] args) {

        // 필드값 확인
         LocalTime localTime = LocalTime.now();
        System.out.println("localTime : " + localTime);

        System.out.println("Hour : " + localTime.getHour());
        System.out.println("Minute : " + localTime.getMinute());
        System.out.println("Second : " + localTime.getSecond());
        System.out.println("Nanosecond : " + localTime.getNano());

        LocalDate date = LocalDate.now();
        System.out.println("date : " + date);
        System.out.println("Year : " + date.getYear());
        System.out.println("Month : " + date.getMonth());
        System.out.println("MonthValue : " + date.getMonthValue());
        System.out.println("DayOfMonth : " + date.getDayOfMonth());
        System.out.println("DayOfWeek : " + date.getDayOfWeek());
        System.out.println("DayOfWeekValue : " + date.getDayOfWeek().getValue());
        System.out.println("DayOfYear : " + date.getDayOfYear());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : " + zonedDateTime);
        System.out.println("zone information : " + zonedDateTime.getZone());
        System.out.println("Timestamp : " + zonedDateTime.getOffset());

    }
}
