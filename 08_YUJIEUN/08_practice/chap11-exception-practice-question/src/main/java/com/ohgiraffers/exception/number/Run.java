package com.ohgiraffers.exception.number;

import java.util.Scanner;

public class Run {

    /*
    * 1. 실행메소드에서 test() 메소드 실행
    2. `public void test(){}`
        - 2 개의 정수를 입력받아, `checkDouble` 메소드로 전달하면서 실행함
        - 리턴된 결과로 결과로 `"ooo의 배수이다/배수가 아니다."` 출력함.
    * */




    public void test(){


        Scanner sc = new Scanner(System.in);
        System.out.println("1에서 100사이의 정수를 하나 입력하세요 :");
        int a = sc.nextInt();
        System.out.println("1에서 100사이의 정수를 하나 입력하세요 :");
        int b = sc.nextInt();


        NumberProcess np = new NumberProcess();
        //인스턴스 메소드인 checkDouble을 호출하기 위해서 객체 지향 프로그래밍의 객체 생성 원칙에 따라 클래스로부터 인스턴스를 만들어 해당 동작 및 상태를 관리하기 위해서,
        //그리고 코드의 책임 분리를 위해 필요합니다.
        try {
            boolean isMultiple = np.checkDouble(a, b);
            if (isMultiple) {
                System.out.println(a+ "은(는) " +  b + "의 배수이다.");
            } else {
                System.out.println(a + "은(는) " + b + "의 배수가 아니다.");
            }
        } catch (NumberRangeException e) {
            // 예외 발생 시 에러메시지 출력
            System.out.println(e.getMessage());
        }


    }

    public static void main(String[] args) {
        new  Run().test();
    }




}



