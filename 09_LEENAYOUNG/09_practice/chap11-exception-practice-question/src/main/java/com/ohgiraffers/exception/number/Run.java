package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }

    public void test1() {

        Scanner sc = new Scanner(System.in);

        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int num2 = sc.nextInt();

        try {
            NumberProcess np = new NumberProcess();
            boolean result = np.checkDouble(num1, num2);
            if (result) {
                System.out.println(num1 + "은(/는) " + num2 + "의 배수입니다.");
            } else {
                System.out.println(num1 + "은(/는) " + num2 + "의 배수가 아닙니다.");
            }
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
