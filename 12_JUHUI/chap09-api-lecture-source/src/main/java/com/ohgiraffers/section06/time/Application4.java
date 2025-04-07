package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application4 {

    public static void main(String[] args) {

        LocalDate dateNow = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2022,11,1);
        LocalDateTime feature = LocalDateTime.of(2025,9,9,9,9,9);
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println("past : " + past);
        System.out.println("feature : " + feature);
        System.out.println("now : " + now);

        // 이전, 이후, 같은 날짜 확인(각 time 패키지 자료형마다 전달인자는 같은 타입이어야 한다.)
        System.out.println(dateNow.isAfter(past));
        System.out.println(localDateTime.isBefore(feature));
        System.out.println(zonedDateTime.isEqual(now));

    }
}
