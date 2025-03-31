package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {

        com.ohgiraffers.section01.method.Calculator calculator = new com.ohgiraffers.section01.method.Calculator();
        // 패키지도 힙영역에 생성해줄 때는 뒤에도 똑같이 코드를 넣어줘야 함

        int plusResult = calculator.plusTwoNumbers(100, 50);
        System.out.println("100과 50의 합은? " + plusResult);

        //import문?
        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumberOf(180, 50);
        System.out.println("두 수 중에 큰 수는 : " + maxResult);
    }
}
