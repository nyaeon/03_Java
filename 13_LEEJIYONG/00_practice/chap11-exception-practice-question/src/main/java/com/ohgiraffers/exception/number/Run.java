package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {

    public void test() {
        NumberProcess numberProcess = new NumberProcess();

        Scanner sc = new Scanner(System.in);
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int b = sc.nextInt();

        try {
            if (numberProcess.checkDouble(a, b)) {
                System.out.printf("%d는 %d의 배수입니다.\n", a, b);
            } else {
                System.out.printf("%d는 %d의 배수가 아닙니다.\n", a, b);
            }
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }
}
