package com.ohgiraffers.section06.time;

import java.time.LocalDateTime;

public class Application3 {
    public static void main(String[] args) {

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("localDateTime1 = " + localDateTime1);
        System.out.println("주소값 : " + System.identityHashCode(localDateTime1)); // 1746572565

        LocalDateTime localDateTime2 = localDateTime1.plusMinutes(30);
        System.out.println("30분 후 : " +  localDateTime2);
        System.out.println("주소값 : " + System.identityHashCode(localDateTime2)); // 142257191

        LocalDateTime localDateTime3 = localDateTime1.plusHours(3);
        System.out.println("3시간 뒤 : " +  localDateTime3);
        System.out.println("주소값 : " + System.identityHashCode(localDateTime3)); // 1044036744
    }
}
