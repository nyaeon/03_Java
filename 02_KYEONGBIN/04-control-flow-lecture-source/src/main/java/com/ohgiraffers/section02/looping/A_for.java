package com.ohgiraffers.section02.looping;

public class A_for {

    public void testSimpleForStatement() {

        // 1부터 10까지 1씩 증가시키면서 값을 출력하는 기본 반복문
        // (1부터; 10까지; 1씩 증가)
        // 1부터 10까지 반복하며 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void generateRandomNumber() {
        // 5부터 10 사이의 난수 생성
        int random = (int) (Math.random() * 6) + 5;
        System.out.println("랜덤 숫자: " + random);
    }

    public static void main(String[] args) {
        A_for example = new A_for();
        example.testSimpleForStatement(); // 1부터 10까지 출력
        example.generateRandomNumber();  // 5~10 사이 랜덤 숫자 출력
    }
}
