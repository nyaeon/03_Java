package com.ohgiraffers.section03.overriding;

public class SuperClass {

    /*
    오버라이딩 (Overriding)
    - 부모 클래스에서 상속받은 메서드를 자식 클래스에서 **재정의(변경)** 하는 것
    - 부모가 물려준 기능을 그대로 사용하지 않고, 자식 클래스에 맞게 변경할 때 사용됨
    - 메서드의 이름, 매개변수, 반환 타입이 부모 클래스의 메서드와 **완전히 동일**해야 함
    - @Override 어노테이션을 붙이면 오버라이딩이 제대로 되었는지 컴파일러가 검사해줌

    ✅ 오버라이딩 조건
    1. 메서드 이름, 매개변수, 반환 타입이 **완전히 동일**해야 한다.
    2. 접근 제어자는 부모 클래스의 메서드보다 **더 강하게** 설정할 수 있다. (ex: protected → public 가능)
    3. 부모 클래스의 메서드가 **private이면 오버라이딩 불가능** (private은 상속되지 않음)
    4. 부모 클래스의 메서드가 **final이면 오버라이딩 불가능** (final은 수정할 수 없음)
    */

    public void method (int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}




}