package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;

public class Application3 {

    public static void main(String[] args) {

        LocalDateTime dateNow = LocalDateTime.now();
        System.out.println("localDateTime : " + dateNow);
        System.out.println("주소값 : " + System.identityHashCode(dateNow));

        LocalDateTime localDateTime = dateNow.plusMinutes(30);
        System.out.println("30분 후 : " + localDateTime);
        System.out.println("주소값 : " + System.identityHashCode(localDateTime));

        LocalDateTime localDateTime2 = dateNow.minusHours(3);
        System.out.println("30분 후 : " + localDateTime2);
        System.out.println("주소값 : " + System.identityHashCode(localDateTime2));
    }
}
