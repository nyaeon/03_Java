package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은 " + cal.plusTwoNumbers(first, second));

        // 두 수 중 더 작은 값
        System.out.println("두 수 중 더 작은 값은 " + cal.minNumberOf(first, second));

        // 두 수 중 더 큰 값
        System.out.println("두 수 중 더 큰 값은 " + Calculator.maxNumberOf(first, second));   // 이미 static으로 되어있으므로 Calculator.maxNumberOf가 있는데, cal.으로 하면 곧 휘발될 것이니까 이렇게 하기보다는 Calculator.으로 하는게 좋음
    }
}
