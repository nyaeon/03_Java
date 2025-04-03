package com.ohgiraffers.section03.interfaceImplements;

public interface InterProduct extends java.io.Serializable /*, java.util.Comparator*/{

    // 인터페이스는 추상메소드, 상수필드만 작성 가능함
    // 인터페이스에서 인터페이스를 상속할 수도 있음 -> extends 사용 (클래스와는 달리 다중상속처럼 받을 수 있다.)
    // 이때 여러 인터페이스를 다중 상속 받을 수 있다.

    // 인터페이스는 상수필드만 작성
    // ********* [[ public static final ]] ********* 제어자 조합을 [상수 필드]라고 부른다.
    public static final int MAX_NUM = 100;
    // 인터페이스는 상수필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final임
    int MIN_NUM = 10;   // 묵시적으로 상수필드임
    // public InterProduct() {}  // 인터페이스는 생성자를 가질 수 없음


    // 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다.
//     public void nonStaticMethod();   // 에러남

    /* 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가짐 (다른 접근제한자 사용 불가)
     * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우, 반드시 접근제한자를 public으로 해야 오버라이딩이 가능하다. */
    public abstract void nonStaticMethod();    // 추상메소드만 작성이 가능하다.

    void abstractMethod();    // 얘 앞에도 묵시적으로 publica abstract가 들어가 있음

    // JDK 1.8에 추가된 기능
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 출력");
    }

    // JDK 1.8에 추가된 기능
    public default void defaultMethod() {
        // 이렇게 하면 non-static 메소드가 됨
        System.out.println("InterProduct 클래스의 defaulMethod 호출됨");
    }




















}
