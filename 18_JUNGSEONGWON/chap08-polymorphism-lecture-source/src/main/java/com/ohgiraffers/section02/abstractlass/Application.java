package com.ohgiraffers.section02.abstractlass;

public class Application {
    public static void main(String[] args) {

        /* 추상클래스와 추상메소드
         *
         * 추상메소드를 0개 이상 포함하는 클래스를 추상클래스라고 한다.
         * 추상클래스는 클래스 선언부에 abstract 키워드를 명시해야 한다.
         * 추상클래스로는 인스턴스를 생성할 수 없다.
         * 추상클래스를 사용하려면 추상클래스를 상속받는 하위 클래스를 이용해서 인스턴스를 생성해야 한다.
         * 이 때 추상클래스는 상위 타입으로 사용될 수 있으며, 다형성을 이용할 수 있다.
         *
         * 추상클래스에 작성한 추상메소드는 반드시 후손이 오버라이딩해서 작성해야 하며,
         * 후손 클래스들의 메소드들의 공통 인터페이스로의 역할을 수행할 수 있다.
         * 추상클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메소드는
         * 다형성이 적용되어 동적바인딩에 의해 다양한 응답을 할 수 있게 된다.
         *
         * 추상상클래스를 상속받아 구현할 때는 extends 키워드를 사용하며
         * -> 자바에서는 extends로 클래스를 상속받을 시 하나의 부모 클래스만 가질 수 있다.(단일상속)
         *
         * 추상메소드란?
         * 메소드의 선언부만 있고 구현부가 없는 메소드를 추상 메소드라고 한다.
         * 추상메소드의 경우 반드시 abstract키워드를 메소드 헤드에 작성해야 한다.
         * ex) public abstract void method();
         *
         * 추상메소드는 개발 진행 중에 자신이 막히는 부분이 있는 경우 그 부분을 추상메소드로 선언을 해서
         * 상대방한테 해결 해 달라고 넘겨주는 경우 사용 하게 된다.
         * */
//        Product product = new Product();

         SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        Product product = new SmartPhone();
        product.abstMethod();

        product.nonStaticMethod();

        Product.staticMethod();

        /*
        * 추상클래스를 왜 쓰는 가?
        * 추상클래스의 추상메소드는 오버라이딩에 대한 강제성이 부여된다.
        * 따라서 여러 클래스들을 그룹화하여 필수 기능을 정의하여 강제성을 부여해 개발 시 일관된 인터페이스를 제공할 수 있다.*/

    }
}
