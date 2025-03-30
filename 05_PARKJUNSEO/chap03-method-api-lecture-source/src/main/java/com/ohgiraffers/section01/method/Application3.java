package com.ohgiraffers.section01.method;

public class Application3 {

    static int global = 10; // 전역변수이면서 클래스 변수

    public static void main(String[] args) {

        int local = 20;  // 지역변수
        System.out.println("global = " + global);
        System.out.println("local = " + local);

        Application3 app = new Application3();
        app.testMethod(13);    // 13은 전달인자
        app.testMethod(local);     // 20도 전달인자
        app.testMethod('a');   // 97로 자동형변환
        app.testMethod((int)12.34); // 강제 형변환
        app.testMethod(2*8);
    }

    /***
     * 정수형 나이를 주면 문자열을 출력해주는 기능
     * @param age
     */
    public void testMethod(int age) {    // age는 매개변수
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
