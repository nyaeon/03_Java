package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }

        scanner.close();
    }
}
