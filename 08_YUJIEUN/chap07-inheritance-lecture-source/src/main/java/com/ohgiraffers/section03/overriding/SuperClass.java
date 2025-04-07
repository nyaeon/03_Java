package com.ohgiraffers.section03.overriding;

public /*final*/ class SuperClass {

    /*
     * 오버라이딩
     *  부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 것이다.
     * */
    public void method(int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}
}