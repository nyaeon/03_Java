package com.ohgiraffers.section01.method;

public class Application7 {

    public static void main(String[] args) {
    int first = 100;
    int second = 50;
    System.out.println(first + second);
    Calculator cal = new Calculator(); //Calulator 에 alt+엔터 후 클래스 생성

        //덧샘
        System.out.println("두 수의 합은 ?"+ cal.plusTwoNumbers(first,second));

        //최솟값 구하기
         System.out.println("두 수 중 가장 작은 값은? "+ cal.minNumbers(first,second));

        //최댓값 구하기
         System.out.println("두 수 중 큰 값은 (static메소드 )>> "+ cal.maxNumbers(first,second));


    }

}
