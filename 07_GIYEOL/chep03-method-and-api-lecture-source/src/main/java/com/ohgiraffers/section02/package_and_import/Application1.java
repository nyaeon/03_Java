package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal.plusTwoNumbers(100,50);
        System.out.println("100 과50 의 합은  " +plusResult);

        int maxreuslt = com.ohgiraffers.section01.method.Calculator.maxNumbers(100,50);
        System.out.println("두 수 중에 큰 수는 :"+ maxreuslt);
    //import 등록은 생략해도 사용가능하지만 패키지가 있는데 자바.long
        // 워낙 기본이 되는 패키지
    }


}
