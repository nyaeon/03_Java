package com.ohgiraffers.section02.package_and_import;



public class Application1 {

    public static void main(String[] args) {
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal.plusTwoNumber(100 , 50);
        System.out.println("100과 50의 합은? " + plusResult);

        int maxResult = com.ohgiraffers.section01.method.Calculator.selectMax(100 , 50);
        System.out.println("두 수 중에 큰 수는 : " + maxResult);


    }
}
