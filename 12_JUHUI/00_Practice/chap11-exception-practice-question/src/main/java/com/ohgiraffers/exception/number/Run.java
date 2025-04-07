package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }

    private void test() {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수 입력 : ");
        int a = sc.nextInt();

        System.out.println("두 번째 정수 입력 : ");
        int b = sc.nextInt();

        NumberCheck check = new NumberCheck();

        try {
            boolean result = check.checkDouble(a,b);
            if(result) {
                System.out.println(a + "은(는) " + b + "의 배수입니다.");
            } else {
                System.out.println(a + "은(는) " + b + "의 배수가 아닙니다.");
            }
        } catch (NumberRangeException e) {
            //throw new RuntimeException(e); // 예외처리 이렇게 하면 빨간글씨로 뜸
            System.out.println(e.getMessage()); // 강사님이 원하신 건 출력문처럼 나오도록 한거라 이렇게 사용해야함.
        }

        sc.close();
    }

}
