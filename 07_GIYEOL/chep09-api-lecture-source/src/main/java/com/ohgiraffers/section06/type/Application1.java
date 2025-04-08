package com.ohgiraffers.section06.type;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Application1 {
    public static void main(String[] args) {

        LocalTime timenow = LocalTime.now();
        LocalTime timenow2 = LocalTime.of(16,48,20);
        System.out.println(timenow);
        System.out.println(timenow2);

        LocalDate datenow = LocalDate.now();
        LocalDate datenow2 = LocalDate.of(2025,4,5);
        System.out.println(datenow);
        System.out.println(datenow2);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTimeof =
                ZonedDateTime.of(datenow2,timenow2, ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);

    }
}
