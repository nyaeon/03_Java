package com.ohgiraffers.serction03.overriding;

public class SubClass extends SuperClass {
    // 1. 메소드 이름 변경하면 에러 발생

    //    @Override
    //    public void method2(int num) {
    //        super.method(num);
    //    }



    // 2. 메소드의 리턴타입 변경하면 에러 발생

    //    @Override
    //    public int method(int num) {
    //        super.method(num);
    //        return num;
    //    }



    // 3. 매개변수 개수나 타입이 변경되면에러가 발생
    //    @Override
    //    public void method(int num, String str) {
    //        super.method(num);
    //    }



    // 4. 메소드 이름, 리턴 타입, 매개변수의 개수, 타입, 순서가 일치하는 경우 오버라이딩 성립

    @Override
    public void method(int num) {
        super.method(num);
    }



    // 5. private 메소드는 오버라이딩 불가

    //    @Override
    //    private void privateMethod() {
    //    }



    // 6. final method는 오버라이딩 불가

    //    @Override
    //    public final void finalMethod() {
    //    }



    // 7. 부모클래스 내의 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능
    // public > protected > default > private

    //    @Override
    //    protected void protectedMethod() {
    //        super.protectedMethod();
    //    }

    // 7-1. 같은 범위로는 가능 (=protected)
    //    @Override
    //    protected void protectedMethod() {
    //        super.protectedMethod();
    //    }

    // 7-2. 더 넓은 범위로도 가능 (=public)
    @Override
    public void protectedMethod() {
        super.protectedMethod();
    }



    // 8. 클래스에서도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드로 사용
    // ===> 클래스 확장 불가
    // ex) public final class SuperClass => SuperClass를 상속받을 수 없음
}
