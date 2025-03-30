package com.ohgiraffers.section03.math;

import java.util.Random;

// java.lang 패키지는 생략가 - 워낙 기본이 되는 패키지라 생략해도 컴파일러가 알아서 추가해줌
public class Application1 {
    public static void main(String[] args) {
        System.out.println("-12.4의 절대값 : " + Math.abs(-12.4));
        System.out.println("두 수 중에 작은값 " + Math.min(10, 20));
        System.out.println("두 수 중에 큰값 " + Math.max(10, 20));
        // (int) (Math.random() * 구하려고 하는 난수의 갯수) + 구하려는 난수의 최소값
        // 0~9 까지의 난수 생성
        int random1 = (int)(Math.random()*10) + 0;
        System.out.println("난수 생성 : " + random1);

        // 1~10 까지의 난수 생성
        int random2 = (int)(Math.random()*10) + 1;
        System.out.println("난수 생성 : " + random2);

        // 10~15 까지의 난수 생성
        int random3 = (int)(Math.random()*6) + 10;
        System.out.println("난수 생성 : " + random3);

        // -128 ~ 127 까지의 난수 발생
        int random4 = (int)(Math.random()*256) + -128;
        System.out.println("난수 생성 : " + random4);

        Random random = new Random();

        int random5 = random.nextInt(10);
        System.out.println("random5 = " + random5);
        int random6 = random.nextInt(10)+ 1;
        System.out.println("random6 = " + random6);
        int random7 = random.nextInt(6)+ 10;
        System.out.println("random7 = " + random7);
        int random8 = random.nextInt(256) - 128;
        System.out.println("random8 = " + random8);

    }
}
