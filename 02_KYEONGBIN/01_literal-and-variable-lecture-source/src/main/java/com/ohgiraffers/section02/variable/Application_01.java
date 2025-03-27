package com.ohgiraffers.section02.variable;

public class Application_01 {
    public static void main(String[] args) {
        // 변수 선언 예시
        int age; // 변수 age는 int 타입으로 선언

        // 변수에 값 대입 예시
        age = 20;  // age에 20을 대입
        age = age; // age 변수에 자기 자신을 다시 대입 (변화 없음)

        // 선언과 동시에 초기화 예시
        int point = 1000; // 변수 point를 선언하고, 동시에 1000으로 초기화

        // 변수의 사용 목적에 대한 이해

        // 1. 값에 의미를 부여하기 위한 목적 (가독성)
        int salary = 10000000;
        int bonus = 4000000;

        System.out.println("=== 값에 의미 부여 테스트 ===");
        System.out.println("보너스를 포함한 급여: " + (salary + bonus) + "원");

        // 2. 한번 저장해둔 값을 재사용 하기 위한 목적
        System.out.println(

        );
        System.out.println("=== 변수에 저장한 값 재사용 테스트 ===");

        int points = 100;

        System.out.println("1번 고객에게 " + points + "포인트가 지급되었습니다");
        System.out.println("2번 고객에게 " + points + "포인트가 지급되었습니다");
        System.out.println("3번 고객에게 " + points + "포인트가 지급되었습니다");
        System.out.println("4번 고객에게 " + points + "포인트가 지급되었습니다");
        System.out.println("5번 고객에게 " + points + "포인트가 지급되었습니다");
        System.out.println("6번 고객에게 " + points + "포인트가 지급되었습니다");

        for (int i = 1; i <= 6; i++) {
            System.out.println(i + "번 고객에게 " + points + "포인트가 지급되었습니다");
        }

        System.out.println();
        System.out.println();

        // 3. 시간에 따라 변경되는 값을 저장하고 사용할 목적
        System.out.println("=== 변수에 저장한 값 변경 테스트 ===");

        int sum = 0;

        sum = sum + 10; // 현재 sum의 값은 sum에 10을 더한 값임
        System.out.println("sum에 10을 더하면 sum = " + sum);

        sum = sum + 10; // 20
        sum = sum + 10; // 30
        sum = sum + 10; // 40
        sum = sum + 10; // 50
        sum = sum + 10; // 60

        for (int i = 1; i <= 6; i++) {
            sum += 10; // sum에 10을 더한 후 출력
            System.out.println("sum에 10을 더하면 sum = " + sum);
        }


    }
}
