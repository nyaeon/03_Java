package com.ohgiraffers.section01.method;

public class Application3 {
    static int global = 10; // static 변수
    public static void main(String[] args) {
        int local = 20; // 지역변수
        System.out.println("global = " + global);
        System.out.println("local = " + local);
        Application3 app = new Application3();
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod('A'); // 자동 형변환 가능
        app.testMethod((int) 12.34); // 강제 형변환 가능
        app.testMethod(3 * 8);   // 산술 연산 가능

    }

    public static void test() {

    }

    /***
     * 정수형 나이를 주면 문자열을 출력해주는 기능
     * @param age
     */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다." );
    }
}
