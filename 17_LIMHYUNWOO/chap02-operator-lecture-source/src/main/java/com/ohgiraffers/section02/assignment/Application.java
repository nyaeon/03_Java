package com.ohgiraffers.section02.assignment;

public class Application {
    public static void main(String[] args) {

        int num = 12 ;
        System.out.println("num = " + num);

        num = num + 3; // 공간 = 값 + 3;  산술복합연산자
        System.out.println("num = " + num);

        num += 3; // 대입연산자
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);

        // 주의
        num =- 5; // =기호 오른쪽은 복합 대입 연산자가 아니다.
        System.out.println("num = " + num);
    }
}
