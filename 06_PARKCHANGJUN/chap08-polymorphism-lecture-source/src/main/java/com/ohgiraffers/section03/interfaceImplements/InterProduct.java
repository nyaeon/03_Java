package com.ohgiraffers.section03.interfaceImplements;

import com.ohgiraffers.section02.abstractclass.Product;

// 다중 상속처럼 사용 할 수 있다.
public interface InterProduct extends java.io.Serializable/*, java.util.Comparator*/{

    // 인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 이용
    // 이때 여러 인터페이스를 다중 상속 받을 수 있다.
    // 자바는 단일 상속인데 인터페이스는 다중 상속처럼 사용할 수 있다.

    // 인터페이스는 상수필드만 작성 가능하다.
    // ***********[[ public static final ]]************* 제어자 조합을 [상수 필드]라고 부른다.
    public static final int MAX_NUM = 100; // public static final 사용 안되는거 같이 색깔이 안들어오는 이유
    // 인터페이스는 상수필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이다.
    int MIN_NUM = 10; // 상수필드, 묵시적 : 드러나있지 않는 것

//    public InterProduct() {} // 인터페이스는 생성자를 가질 수 없다.

    // 추상 메소드에서는 일반 생성자를 가질 수 있다.
    // 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다.
//    public void nonStaticMethod() {} // 에러남

    /**
     * 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다.
     * (다른 접근제한자 사용 불가)
     * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우
     * 반드시 접근제한자를 public으로 해야 오버라이딩 가능하다.
     */
    public abstract void nonStaticMethod(); // 추상메소드 만듬
    void abstMethod(); // 위와 같은 말. 묵시적으로 public abstarct가 있다.

    // (JDK 1.8 추가된 기능)
    public static void staticMethod() {
        System.out.println("InterProduct의 클래스의 staticMethod 호출됨...");
    }

    // (JDK 1.8 추가된 기능)
    public default void defaultMethod() {
        System.out.println("InterProduct클래스의 defaultMethod호출됨");
    }

}
