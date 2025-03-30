package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        // 0.0 <= x < 1.0
        // (int) (Math.random() * 구하려는 난수 갯수) + 구하려는 난수의 최솟값
        // 0~9까지 난수 생성 (정수 0이상 9이하로)
        int random1 = (int) (Math.random() * 10 -1);
        System.out.println(random1);

        // 1~10까지 난수 생성
        int random2 = (int) (Math.random() * 10 + 1);
        System.out.println(random2);

        // 10~15까지 난수 생성
        int random3 = (int) (Math.random() * 6 + 10);
        System.out.println(random3);

        // -128 ~ 127
        int random4 = (int) (Math.random() * 256 - 128);
        System.out.println(random3);

        // Random() -> java.util이라는 패키지에 Random 클래스라는 것이 있음
    }
}
