package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {

        System.out.println("main() 시작됨");
        // 객체를 생성
        Application2 app = new Application2();
        app.methodA();
        app.methodC();
        app.methodB();
        System.out.println("main() 종료됨");
    }
    /***
     * static 키워드 가 없는
     * non - static method 사용  static 메소드가 없어 methodA는 사용이 안된다.  따로 객체를 만들어서 호출을 해줘야 사용이 가능하다.
     */
    public void methodA(){
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");

    }
    public void methodB(){
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
    public void methodC(){
        System.out.println("methodC() 호출됨");
        System.out.println("methodC() 종료됨");
    }
}
