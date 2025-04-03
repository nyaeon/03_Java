package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        String reuslt = testMethod();
        System.out.println("reuslt = " + reuslt);

        System.out.println("result2 = " + testMethod());
        System.out.println("main() 메소드 종료함");
    }
    public static String testMethod() {
        System.out.println("test()메소드 실행함");
        return "test";
    } // void가 아닌 경우 return이 생략되어 있지 않기 때문에 return을 작성 해 줘야 한다.
}
