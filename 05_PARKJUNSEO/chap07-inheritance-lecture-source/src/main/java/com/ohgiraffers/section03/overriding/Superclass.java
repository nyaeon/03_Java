package com.ohgiraffers.section03.overriding;

public class Superclass {
    /*
    * 오버라이딩
    * 부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 것이다.
    * */
    public void method(int num) {}
    private void privatemethod(int num) {}
    public final void finalmethod(int num) {}    // 얘는 자식 클래스 (Subclass)가 상속 불가능
    protected void protectedmethod(int num) {}



}
