package com.ohgiraffers.section03.overriding;

// 📌 부모 클래스 SuperClass를 상속받은 SubClass
public class SubClass extends SuperClass {

    // 1️⃣ 메서드 이름이 다르면 오버라이딩 불가능 ❌
//    @Override
//    public void method_2 (int num) { // ❌ method → method_2 (X)
//        super.method(num);
//    }

    // 2️⃣ 리턴 타입이 다르면 오버라이딩 불가능 ❌
//    @Override
//    public int method(int num) {  // ❌ void → int (X)
//        super.method(num);
//    }

    // 3️⃣ 매개변수 개수나 타입이 다르면 오버라이딩 불가능 ❌
//    @Override
//    public void method(int num, String str) { // ❌ 매개변수 개수 다름 (X)
//        super.method(num);
//    }

    // 4️⃣ 메서드 이름, 리턴 타입, 매개변수가 **완전히 일치**해야 오버라이딩 가능 ✅
    @Override
    public void method(int num) {
        super.method(num); // 부모 클래스의 method(int num) 호출
    }

    // 5️⃣ private 메서드는 오버라이딩 불가능 ❌
//    @Override
//    private void privateMethod() { // ❌ private 메서드는 상속되지 않음
//        super.privateMethod();
//    }

    // 6️⃣ final 메서드는 오버라이딩 불가능 ❌
//    @Override
//    public final void finalMethod() { // ❌ final 메서드는 변경할 수 없음
//        super.finalMethod();
//    }

    // 7️⃣ 부모 메서드의 접근 제어자보다 같거나 넓은 범위로만 오버라이딩 가능 ✅
    // public > protected > default > private

    // ❌ 더 좁은 범위로 오버라이딩하면 에러 발생
//    @Override
//    void protectedMethod() { // ❌ protected → default (X)
//        super.protectedMethod();
//    }

    // ✅ 같은 범위로 오버라이딩 가능
//    @Override
//    protected void protectedMethod() { // protected → protected (✅)
//        super.protectedMethod();
//    }

    // ✅ 더 넓은 범위로 오버라이딩 가능 (protected → public)
    @Override
    public void protectedMethod() {
        super.protectedMethod();
    }

    // 🔒 클래스에도 `final` 키워드를 추가할 수 있음
    // --> `final class`가 되면 **이 클래스를 상속할 수 없음**
}
