package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String [] args){

        System.out.println("main() 시작됨");
        // methodA 의 경우 static 변수로 따로 선언을 안해줬기 때문에 별도의 선언이 필요하다.
        Application2 app = new Application2();
        app.methodA();
        app.methodB();
        app.methodC();
        System.out.println("main() 종료됨");
    }

    /***
     * static 키워드가 없는
     * non-static method 사용
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
