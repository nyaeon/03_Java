package com.ohgiraffers.section03.increment;

public class Application_01 {
    public static void main(String[] args) {

        // 후위 연산자: 다른 연산을 먼저 수행한 후 증가
        int firstNum = 20;
        int result1 = firstNum++ * 3;

        System.out.println("result1 : " + result1);   // 20 * 3 = 60
        System.out.println("firstNum : " + firstNum); // firstNum은 연산 후 21로 증가

        // 전위 연산자: 먼저 증가한 후 다른 연산 수행
        int secondNum = 20;
        int result2 = ++secondNum * 3;

        System.out.println("result2 : " + result2);   // 21 * 3 = 63
        System.out.println("secondNum : " + secondNum); // secondNum은 21

        // 후위 연산자 테스트
        int num1 = 10;
        int addNum = num1++; // addNum에는 10이 저장되고, num1은 11로 증가

        System.out.println("addNum : " + addNum);

        // 복잡한 연산 테스트
        int a = 3;
        int b = 5;
        int c = -1;

        int d = a + --b; // b 먼저 감소(5 -> 4), d = 3 + 4 = 7

        b = 2 * (-c + a++) - d;
        // a++이므로 현재 값(3) 사용 후 증가(4)
        // -c = 1, (1 + 3) * 2 = 8
        // 8 - 7 = 1 → b = 1

        c *= 2; // c = -1 * 2 = -2
        a = b++ + c;
        // b(1) 사용 후 증가(2), -2 + 1 = -1 → a = -1

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
