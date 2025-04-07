package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {

    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNow2 = LocalTime.of(16, 48, 20);
        System.out.println("timeNow: " + timeNow);
        System.out.println("timeNow2: " + timeNow2);

        LocalDate dateNow = LocalDate.now();
        LocalDate dateNow2 = LocalDate.of(2025, 4, 5);
        System.out.println("dateNow: " + dateNow);
        System.out.println("dateNow2: " + dateNow2);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println("zonedDateTimeNow: " + zonedDateTimeNow);

        ZonedDateTime zoneDateTimeOf =
                ZonedDateTime.of(dateNow2, timeNow2, ZoneId.of("Asia/Seoul"));
        System.out.println("zoneDateTimeNowOf: " + zoneDateTimeOf);

    }
}
