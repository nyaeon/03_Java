package com.ohgiraffers.section01.method;

public class Application3 { //전역

    static int global = 10; // 전역변수(클래스)


    public static void main(String[] args) {

        int local = 20; // 지역변수
        System.out.println("global = " + global);
        System.out.println("local = " + local);

        Application3 app = new Application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod('a'); // 자동형변환
        app.testMethod((int)12.34);
        app.testMethod(3*8);
    } // 지역

    public static void test(){
        //local
    }

    /***
     * 정수형 나이를 주면 문자열을 출력해주느 기능
     * @param age
     */
    public void testMethod (int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
