package com.ohgiraffers.section03.employeement;

public interface Interproduct extends java.io.Serializable /*, java.util.comparator*/ {
    //인터페이스가 인터페이스를 상속받을 시에는 extends 키워드를 이용하며
    //이때 여러 인터페이슬를 다중 상속 받을 수 있다
    //인터페이스는 상수 필드만 작성 가능
    //**********[[public static final]] 제어자 조합을 [상수필드]라 함
    public static final int Max_num =100;
    //인터페이스는 상수 필드만 가질 수 있기 때문에
    //모든 필드는 묵시적으로 public static final이다
    int Min_num = 10;
    //public interproduct() {} //인터페이스는 생성자를 가질 수 없다

    //인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다
    // public void nonstaticfield(){}//에러남

    /***
     * 인터페이스 안에 작성한 메소드는 묵시적을 public abstract의 의미를 가짐
     * (다른 접근제한자 사용 불가)
     * 따라서 인터페이스의 메소드를 오버라이딩하는 경우
     * 반드시 접근제어자 public 를 해야 오버라이딩 가능
     */
    public abstract void abstractMethod();  // 추상메소드 생성


    void abstmethod();

    //(JDK 1.8에 추가된 기능)
    public static void staticmethod() {
        System.out.println("interproduct 클래스의 staticmethod 호출됨");
    }
    //(JDK 1.8에 추가된 기능)
    public default void defaultmethod(){
        System.out.println("interproduct 클래스의 defaultmethod 호출됨");
    };



}
