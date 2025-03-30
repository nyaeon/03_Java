package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        String result = testmethod();
        System.out.println("result "+ result);

        System.out.println("result2 =" + testmethod());
        System.out.println("main() 메소드 종료");
    }
    public static String testmethod() {
        System.out.println("testmethod() 실행");
        return "testmethod ";
    }
}
