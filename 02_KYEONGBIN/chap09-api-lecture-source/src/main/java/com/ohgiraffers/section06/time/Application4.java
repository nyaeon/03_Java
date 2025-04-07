package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application4 {

    public static void main(String[] args) {

        /*
         * 현재 날짜 및 시간 가져오기
         */
        LocalDate localDate = LocalDate.now(); // 현재 날짜
        LocalDateTime localDateTime = LocalDateTime.now(); // 현재 날짜 + 시간
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // 현재 날짜 + 시간 + 시간대 정보

        /*
         * 특정 날짜 및 시간 생성
         */
        LocalDate past = LocalDate.of(2025, 4, 4); // 2025년 4월 4일
        LocalDateTime future = LocalDateTime.of(2025, 4, 4, 23, 59, 59); // 2025년 4월 4일 23:59:59
        ZonedDateTime now = ZonedDateTime.now(); // 현재 날짜 + 시간 + 시간대 정보

        /*
         * 날짜 비교
         * - isAfter() : 현재 날짜가 비교 날짜보다 이후인지 확인
         * - isBefore() : 현재 날짜가 비교 날짜보다 이전인지 확인
         * - isEqual() : 두 날짜가 같은지 확인
         * ⚠️ 각 메서드의 전달인자는 같은 타입이어야 함!
         */
        System.out.println(localDate.isAfter(past)); // 현재 날짜가 2025년 4월 4일 이후인가?
        System.out.println(localDateTime.isBefore(future)); // 현재 날짜가 2025년 4월 4일 23:59:59 이전인가?
        System.out.println(zonedDateTime.isEqual(now)); // ZonedDateTime이 같은가?
    }
}
