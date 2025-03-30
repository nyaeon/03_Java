package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String [] args){    // main method 프로그램의 시작을 알리는 기능
        System.out.println("main() 시작함");
        /* Application1.methodA(); 다른 클래스에 있는 경우 호출 방법*/
        methodA();
        System.out.println("main() 종료됨");
    }
    public  static void methodA(){
        System.out.println("methodA() 호출됨");
        methodB();
        System.out.println("methodA() 종료됨");
        // return; 숨어있음 출력 끝나고 다시 methodA();(호출지점)으로 돌아감
    }

    /***
     * methodB() 입니다.
     */
    public static void methodB(){
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}
