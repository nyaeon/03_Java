package com.ohgiraffers.section03.interfaceimplement;

public class Product extends Object implements interProduct { // 여러개 쓸 수 있다.

/*
클래스에서 인터페이스를 상속받을 떼에는 implements 키워드를 사용한다.
또한 인터페이스는 여러 개를 상속 받을 수 있으며, extends로 다른 클래스를 상속받는 경우에는
그것과 별개로 인터페이스도 추가 상속이 가능해진다.
단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다.
(순서 바뀌면 에러 발생!!)
 */


    @Override
    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함..");
    }



    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod 호출함...");
    }

    // Static 메서드는 오버라이딩 할 수 없음 그냥 있는거 써야함//
//    @Override
//    public static void staticMethod() {}



    // default 메서드는 인터페이스에서만 작성 가능하다.
//    @Override
//    public default void defaultMethod() ;

    // default 키워드를 제외하면 오버라이딩 가능하다.
    @Override
    public void defaultMethod() {
        System.out.println("Product 클래스의 defaultMethod 호출됨...");
    }

}
