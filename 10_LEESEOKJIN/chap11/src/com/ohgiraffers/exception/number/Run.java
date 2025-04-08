package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    Scanner scanner = new Scanner(System.in);

    public void test() {
        System.out.print("1에서 100 사이의 정수를 입력하세요: ");
        var a = scanner.nextInt();

        System.out.print("1에서 100 사이의 정수를 입력하세요: ");
        var b = scanner.nextInt();

        try {
            if (NumberProcess.checkDouble(a, b)) {
                System.out.println(a + "는 " + b + "의 배수입니다.");
            } else {
                System.out.println(a + "는 " + b + "의 배수가 아닙니다.");
            }
        } catch (NumberRangeException e) {
            System.out.println("1부터 100 사이의 값이 아닙니다.");
        }
    }
}
