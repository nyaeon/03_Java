package com.ohgiraffers.section02.assinment;

public class Application1 {
    public static void main(String[] args) {
        int num= 12;
        System.out.println("num = " + num);

        num = num + 3; // 공간 = 값 + 3;
        System.out.println("num = " + num);

        num += 3;
        System.out.println("num = " + num);
        
        num -= 5;
        System.out.println("num = " + num);
        
        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 10;
        System.out.println("num = " + num);
    }
}
