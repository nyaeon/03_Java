package com.ohgiraffers.section03.overriding;

public class Subclass extends Superclass {

    // 1. 메소드 이름을 변경하면 에러 발생

//    @Override
//    public void method2(int num) {
//        super.method(num);        // 부모가 가진 메소드의 인자를 넣겠다.
//    }

    // 2. 메소드의 반환 타입을 변경하면 에러 발생
//    @Override
//    public void method(int num) {
//        return 0;
//    }

    // 3. 매개변수 개수나 타입이 변경되면 에러 발생
//    @Override
//    public void method(int num, String str) {
//        super.method(num);
//    }

    // 4. 메소드 이름, 반환 타입, 매개변수의 개수, 타입, 순서가 일치하는 경우 오버라이딩 성립
    @Override
    public void method(int num) {
        super.method(num);
    }

    // 5. private 접근 제한자는 오버라이딩 불가
//    @Override
//    private void method(int num) {
//        super.method(num);
//    }

    // 6. final이 붙은 것을 억지로 가져와도 오버라이딩 불가
//    @Override
//    public final void method(int num) {
//        super.method(num);
//    }

    // 7. 부모 클래스 내 메소드의 접근제한자와 같거나 더 넓은 오버라이딩은 가능
    // public > protected > default > private
//    @Override
//    void protectedmethod(int num) {    => 접근제한자가 default이기 때문에 오버라이딩 불가
//        super.protectedmethod(num);
//    }

//    @Override
//    protected void protectedmethod(int num) {}    => 같은 범위로는 가능

    @Override
    public void protectedmethod(int num) {        // => 더 넓은 범위는 가능
        super.protectedmethod(num);
    }

    // 8. 부모 클래스에 final이 있다면 클래스 확장 불가. 즉 클래스 상속이 불가능해짐
}