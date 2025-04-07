package com.ohgiraffers.section03.employeement;

public class Product extends Object implements Interproduct, java.io.Serializable {
    /***
     * 클래스에서 인터페이스를 상서받을 때에서는 implements 키워드 사용
     * 인터페이스는 여래개를 상속 받을 수 있으며, extends 로 다른 클래스를 상속받는 경우에는
     * 그것과 별개로 인터레이스도 추가 상속이 가능해진다
     * extends 키워드를 앞에 작성하고 implements 를 뒤에 작성한다
     * 순서가 바뀌면 오류 발생
     */
    @Override
    public void abstractMethod() {
        System.out.println("product 클래스의 nonstaticmethod를 호출");
    }

    @Override
    public void abstmethod() {
        System.out.println("product클래스의 abstmethod 호출");
    }
    //static 메소드는 오버라이딩 불가
    // @Override
    //public static void staticmethod(){}

    
    //default 메소드는 인터페이스에서만 작성 가능
    //@Override
    // public default void defaultmethod();
    //default 키워드를 제외하면 오버라이딩이 가능함
    @Override
    public void defaultmethod() {
        System.out.println("product 클래스의 defaultmethod 호출");
    }
}
