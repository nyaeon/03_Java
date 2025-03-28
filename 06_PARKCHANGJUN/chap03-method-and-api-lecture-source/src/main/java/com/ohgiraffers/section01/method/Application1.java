package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {
        System.out.println("main() 시작함");
        methodA();
        System.out.println("main() 종료됨");
    } // 받는거

    public static void methodA() {
        System.out.println("methodA() 호출됨");

    }
}
// return 만나면 호출한 곳으로 되돌아가야됨.
// void 뒤에 return, 이게 숨어있음