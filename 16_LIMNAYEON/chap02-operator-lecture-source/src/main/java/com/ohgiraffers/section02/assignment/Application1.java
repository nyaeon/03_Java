package com.ohgiraffers.section02.assignment;

public class Application1 {
    public static void main(String[] args) {

        int num = 12;
        System.out.println("num = " + num);

        num += 2;
        System.out.println("num = " + num);

        num -= 3;
        System.out.println("num = " + num);

        num *= 4;
        System.out.println("num = " + num);

        num /= 5;
        System.out.println("num = " + num);

        num %= 6;
        System.out.println("num = " + num);

        // 주의
        num =- 5; // equal(=)기호는 오른쪽은 대입
        System.out.println("num = " + num);
    }
}
