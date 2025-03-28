package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        //삼항 연산자
        // (조건식)? 이 참일 때 사용할 값 1 : 거짓일 때 사용할 값2
        int num1 = 10;
        int num2 = 20;
        String result1 = (num1 > 0) ? "양수" : "양수가 아님";
        System.out.println(result1);
        boolean result2 = (num2 > 0) ? true : false;
        System.out.println(result2);


        int num3 = 0;
        int num4 = 1;
        int num5 =-1;
        String result3 =(num3 >0)? "양수" : (num3 == 0)? "0": "음수";
        String result4 =(num4 >0)? "양수" : (num4 == 0)? "0": "음수";
        String result5 =(num5 >0)? "양수" : (num5 == 0)? "0": "음수";
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }
}
