package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();
        
         // 덧셈
        System.out.println("두 수의 합은 ? " + cal.plusTwoNumber(first,second));

        System.out.println("두 수의 차는 ? " + cal.minusTwoNumber(first,second));
        System.out.println("두 수의 곱은 ? " + cal.multiplyTwoNumber(first,second));
        System.out.println("두 수의 나눔은 ? " + cal.divideTwoNumber(first,second));

        // 최솟값
        System.out.println("작은 값은 ? " + cal.selectMin(first,second));
        // 최댓값
        System.out.println("큰 값은 ? (static 메소드)" + Calculator.selectMax(first,second));

    }
}
