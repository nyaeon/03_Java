package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        LocalTime now2 = LocalTime.of(16, 48, 20);
        System.out.println("now2 = " + now2);

        LocalTime dateNow = LocalTime.now();
        LocalDate dateNow2 = LocalDate.of(2025, 5, 6);
        System.out.println(dateNow);
        System.out.println(dateNow2);

        ZonedDateTime zonedNow = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedNow);

        ZonedDateTime zonedDateTimeOf =
                ZonedDateTime.of(dateNow2, now2, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);


    }
}
