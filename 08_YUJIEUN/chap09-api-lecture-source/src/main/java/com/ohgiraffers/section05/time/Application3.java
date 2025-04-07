package com.ohgiraffers.section05.time;

import java.time.LocalDateTime;

public class Application3 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = "+localDateTime);
        System.out.println("주소값 : " +System.identityHashCode(localDateTime));

        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        System.out.println("30분 후 :"  + localDateTime1);
//        System.out.println("주소값 :" + System,identitylocalDateTime1);
    }
}
