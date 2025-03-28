package com.ohgiraffers.section01.method;

public class Application_02 {
    public static void main(String[] args) {
        System.out.println("main() is started");

        // 객체 생성 후 non-static 메서드 호출
        // Application_02 클래스의 객체를 생성하려면 'new' 키워드를 사용합니다.
        // 클래스는 설계도와 같고, 객체는 그 설계도를 바탕으로 만들어진 실제 존재입니다.
        // 'app'은 객체를 참조하는 변수로, 이 객체는 methodA(), methodB(), methodC()와 같은 메서드를 실행할 수 있습니다.
        Application_02 app = new Application_02(); // Application_02 클래스의 인스턴스(객체) 생성

        // 생성된 객체를 통해 methodA(), methodB(), methodC()를 호출합니다.
        // 객체가 있어야 non-static 메서드를 호출할 수 있습니다.
        app.methodA(); // 생성된 객체를 통해 methodA()를 호출
        app.methodC(); // 생성된 객체를 통해 methodC()를 호출
        app.methodB(); // 생성된 객체를 통해 methodB()를 호출

        System.out.println("main() is finished");
    }

    /***
     * static 키워드가 없는
     * non-static method 사용
     */
    public void methodA() {
        // methodA()는 non-static 메서드입니다.
        // non-static 메서드는 반드시 객체를 통해 호출해야 합니다.
        System.out.println("methodA() is started");
        System.out.println("methodA() is finished");
    }

    public void methodB() {
        // methodB()는 non-static 메서드입니다.
        // 객체를 통해 호출해야 하며, methodA()와 유사하게 동작합니다.
        System.out.println("methodB() is started");
        System.out.println("methodB() is finished");
    }

    public void methodC() {
        // methodC()는 non-static 메서드입니다.
        // methodA()와 methodB()와 마찬가지로 객체를 통해 호출됩니다.
        System.out.println("methodC() is started");
        System.out.println("methodC() is finished");
    }
}
