package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("main() 시작함");
        Application1.methodA();
        System.out.println("main() 종료됨");
    }

    public static void methodA() {
        System.out.println("methodA() 호출됨");
        methodB();
        System.out.println("methodA() 종료됨");
=======

        System.out.println("main() 시작됨...");
        Application1.methodA();
        Application1 app = new Application1();
        app.methodA();

        System.out.println("main() 종료됨...");

    }

    /***
     */

    public static void methodA() {

        System.out.println("methodA() 호출함...");

        Application1.methodB();

        System.out.println("methodA() 종료됨...");

    }

    public static void methodB() {

        System.out.println("methodB() 호출함...");

        methodC();

        System.out.println("methodB() 종료됨...");

>>>>>>> a8fb790 (수정4)
    }

    /***
     * methodB() 입니다.
     */
<<<<<<< HEAD
    public static void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }

=======
    public static void methodC() {

        System.out.println("methodC() 호출함...");
        System.out.println("methodC() 종료됨...");

    }
>>>>>>> a8fb790 (수정4)
}
