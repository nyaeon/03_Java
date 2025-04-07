package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;

public class Application3 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("Hashcode : " + System.identityHashCode(localDateTime));

        LocalDateTime localDateTime1 =  localDateTime.plusMinutes(30); // plus 하면 그만큼 값이 늘어남
        System.out.println("In 30 minutes : " + localDateTime1);
        System.out.println("Hashcode : " + System.identityHashCode(localDateTime1));

        LocalDateTime localDateTime2 =  localDateTime.plusHours(3);
        System.out.println("In 3 hours : " + localDateTime2);
        System.out.println("Hashcode : " + System.identityHashCode(localDateTime2));


    }
}
