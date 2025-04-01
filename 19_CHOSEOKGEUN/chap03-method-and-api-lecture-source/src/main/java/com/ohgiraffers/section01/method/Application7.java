package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cec8712 (왜 안돼~~)
        int first = 100;
        int second = 50;

        Calculator cal  = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은 ? " + cal.plusTwoNumbers(first, second));

        // 두 수 중의 최소값 구하기
        System.out.println("두 수 중 작은 값은? " + cal.minNumberOf(first, second));

        // 두 수 중의 최대값 구하기
        System.out.println("두 수 중 큰값은? (static 메소드) >> " + Calculator.maxNumberOf(first, second));
        System.out.println("두 수 중 큰값은? (static 메소드) >> " + cal.maxNumberOf(first, second));
    }
}
<<<<<<< HEAD
=======
        /* 매개변수와 리턴값 복합 활용 */
        /* 매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기 */

        /* 숫자 두 개를 매개변수로 입력 받아 연산하는 메소드를
         * 사칙연산별로 추가해서 호출하는 테스트를 해보자
         * */
        int first = 20;
        int second = 10;

        Application7 app = new Application7();
        System.out.println("두 수를 더한 결과 : " + app.plusTwoNumbers(first, second));
        System.out.println("두 수를 뺀 결과 : " + app.minusTwoNumbers(first, second));
        System.out.println("두 수를 곱한 결과 : " + app.multipleTwoNumbers(first, second));
        System.out.println("두 수를 나눈 결과 : " + app.divideTwoNumbers(first, second));

    }

    public int plusTwoNumbers(int first, int second) {

        return first + second;
    }

    public int minusTwoNumbers(int first, int second) {

        return first - second;
    }

    public int multipleTwoNumbers(int first, int second) {

        return first * second;
    }

    public int divideTwoNumbers(int first, int second) {

        return first / second;
    }
}
>>>>>>> a8fb790 (수정4)
=======
>>>>>>> cec8712 (왜 안돼~~)
