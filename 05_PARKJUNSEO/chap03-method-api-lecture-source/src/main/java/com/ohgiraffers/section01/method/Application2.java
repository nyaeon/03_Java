package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {

        System.out.println("main() 시작됨");
        // methooA() 못 씀 // 누가 부르지 않으면 non-static인 methodA()는 사용 불가

        // 객체를 생성해야 함 (일단 이 부분은 암기) // non-static 메서드를 호출하는 방법
        Application2 app = new Application2();   // new 뒤에 있는 애도 method의 일종임
        app.methodA();
        app.methodB();
        app.methodC();
        System.out.println("main() 종료됨");
    }

    /***
     * static 키워드가 없는
     * non-static method 사용
     */
    public void methodA() {
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨");
        System.out.println("methodC() 종료됨");
    }
}
