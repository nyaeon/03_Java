package com.ohgiraffers.section03.overriding;

// 클래스에서도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드로 사용
// ===> 클래스 확장 불가
public /*final*/ class SuperClass {

    /**
     * 오버라이딩
     * 부모클래스에서 상속받은 메소드를 자식클래스에서 재정의하여 사용하는 것이다.
     */
    public void method(int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}
}
