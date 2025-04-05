package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {

    public static void main(String[] args) {

        LocalTime timeNow = LocalTime.now();
        LocalTime timeNow2 = LocalTime.of(16, 48, 20);
        System.out.println(timeNow);    // 마이크로초까지

        LocalDate dateNow = LocalDate.now();
        LocalDate dateNow2 = LocalDate.of(2025, 3, 17);
        System.out.println(dateNow);
        System.out.println(dateNow2);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        System.out.println(zonedDateTimeNow);
        ZonedDateTime zonedDateTimOf =
                ZonedDateTime.of(dateNow2, timeNow2, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTimOf);
    }
}
