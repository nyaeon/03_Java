package com.ohgiraffers.section01.method;

public class Application3 {

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cec8712 (왜 안돼~~)
    static int global = 10; //클래스(static)변수

    public static void main(String[] args) {

        int local = 20;  // 지역변수
<<<<<<< HEAD
=======
    static int global = 10; // 클래스(static) 변수

    public static void main(String[] args) {

        int local = 20; // 지역변수
>>>>>>> a8fb790 (수정4)
=======
>>>>>>> cec8712 (왜 안돼~~)
        System.out.println("global = " + global);
        System.out.println("local = " + local);

        Application3 app = new Application3();
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> cec8712 (왜 안돼~~)
        app.testMethod(13);
        app.testMethod(local);
        app.testMethod('a');
        app.testMethod((int) 12.34);
        app.testMethod(3 * 8);
    }

    public static void test() {

    }

    /***
     * 정수형 나이를 주면 문자열을 출력해주는 기능
     * @param age
     */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
<<<<<<< HEAD
=======

        app.testMethod(13);
        app.testMethod(local);
        app.testMethod('a');
        app.testMethod((int)12.34);
        app.testMethod(3 *8);
    }

    public static void test() {
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는" + age + "세 입니다.");

    }
}
>>>>>>> a8fb790 (수정4)
=======
>>>>>>> cec8712 (왜 안돼~~)
