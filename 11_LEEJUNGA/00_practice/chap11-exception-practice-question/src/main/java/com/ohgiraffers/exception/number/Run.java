package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {
//    1. 실행메소드에서 test() 메소드 실행
//2. `public void test(){}`
//            - 2 개의 정수를 입력받아, `checkDouble` 메소드로 전달하면서 실행함
//    - 리턴된 결과로 결과로 `"ooo의 배수이다/배수가 아니다."` 출력함.
    public static void main(String[] args) {
        Run run = new Run();
        run.test();
    }

    public void test(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("1에서 100사이의 정수를 하나 입력하세요 : ");
        int b = sc.nextInt();

        NumberProcess np = new NumberProcess();
        try {
            boolean result = np.checkDouble(a, b);
            String resultMsg = result ? "배수입니다." : "배수가 아닙니다.";
            System.out.println(a + "는 " + b + "의 " + resultMsg);
        } catch (NumberRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
