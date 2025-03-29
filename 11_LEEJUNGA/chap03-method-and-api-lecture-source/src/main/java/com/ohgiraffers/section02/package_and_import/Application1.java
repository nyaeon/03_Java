package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        com.ohgiraffers.section01.method.Calculator cal = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal.plusTwoNumbers(100, 50);
        System.out.println("100 + 50 = " + plusResult);
    }
}
