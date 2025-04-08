package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application4 {

    public static void main(String[] args) {

        LocalDate localdate = LocalDate.now();
        LocalDateTime localdatetime = LocalDateTime.now();
        ZonedDateTime zoneddatetime = ZonedDateTime.now();

        LocalDate past = LocalDate.of(2022, 11, 11);
        LocalDateTime future = LocalDateTime.of(2025, 9,9,9,9,9);
        ZonedDateTime now = ZonedDateTime.now();

        // 이전, 이후, 같은 날짜 확인(각 time 패키지 자료형마다 전달인자는 같은 타입이어야 한다.)
        // 날짜 / 시간 비교 메소드
        /*
        * isAfter() :
        * isBefore() :
        * isEqual() :
        * */
        System.out.println(localdate.isAfter(past)); // true
        System.out.println(localdatetime.isBefore(future)); // true
        System.out.println(zoneddatetime.isEqual(now)); // true

    }
}
