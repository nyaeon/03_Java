package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        System.out.println("main() 메소드 호출함");
        String reult = testMethod();
        System.out.println("reult = " + reult);


        System.out.println("reult2 = " + testMethod());
        System.out.println("main() 메소드 종료함");
    }

    public static String testMethod(){
        System.out.println("test() 메소드 실행함");
        return "test";  // 얘는 return값을 써줘야 함. void가 아니라서
    }
}
