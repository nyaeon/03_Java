package com.ohgiraffers.section07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application1 {
    public static void main(String[] args) {

        // 문자열을 parse를 통해 날짜와 시간 형식으로 바꿔줌
        String timeNow = "16:23:10";
        String dateNow = "2025-04-04";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "|" + timeNow);
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

//        // 패턴 인식 쌤꺼 참조
//        String localTime1 = LocalTime.parse(timeNow2, DataTimeFormatter.offPattern("HH-mm-ss"));


    }
}
