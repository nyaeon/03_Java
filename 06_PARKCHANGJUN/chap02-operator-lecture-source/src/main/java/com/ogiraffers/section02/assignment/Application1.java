package com.ogiraffers.section02.assignment;

public class Application1 {

    public static void main(String[] args) {
        int num = 12;
        System.out.println("Num = " + num);

        num = num + 3; // 공간 = 값 + 3;
        System.out.println("Num = " + num);

        num += 3;
        System.out.println("Num = " + num);

        num -= 5;
        System.out.println("Num = " + num);

        num *= 2;
        System.out.println("Num = " + num);

        num /= 2;
        System.out.println("Num = " + num);

        num %= 10; // 나머지 값만 나옴. 10으로 나누면 1 나머지 3이기 때문
        System.out.println("Num = " + num);

        // 주의
        num =- 5; // equal(=) 기호 오른쪽은 
        System.out.println("Num = " + num);
    }
}
