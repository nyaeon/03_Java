package com.ohgiraffers.section03.inferfaceImplements;

import com.ohgiraffers.section02.abstactclass.SmartPhone;

public interface InterProduct extends java.io.Serializable /*, java.util.Comparator*/ {
    // 추상메소드, 상수 필드만 들어올 수 있음
    // 뼈대에 뼈대를 이어 하나로 이음.

    // 인터페이스에서 인터페이스를 상속 받을 때도 extends 키워드 사용
    // 이때 여러 인터페이스를 다중 상속 받을 수 있다.

    // 인터페이스는 상수필드만 작성 가능하다.
    // ***********[[ public static final ]] *********** 제어자 조합을 [상수 필드]라고 부른다.

    public static final int MAX_NUM = 100;
    // 인터페이스는 상수필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이다.
    int MIN_NUM = 10;

    //public InterProduct() {} // 인터페이스는 생성자를 가질 수 없다.

    // 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다.
    //public void nonStaticMethod() {};// 에러남

    /*
     * 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다.
     * (다른 접근제한자 사용불가)
     * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우
     * 반드시 접근제한자를 public으로 해야 오버라이딩 가능하다.
     */
    public abstract void nonStaticMethod(); // 추상메소드를 만든거. 추상메소드만 작성 가능.

    void abstMethod(); // 안써도 public abstract 있다.

    // (JDK 1.8에 추가된 기능. 이전 버전에서는 사용불가)
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨..");
    }

    //(이것도 JDK 1.8에 추가된 기능)
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨..");
    } //어댑터랑 비슷한 느낌. default를 붙여서 에러가 안남



}
