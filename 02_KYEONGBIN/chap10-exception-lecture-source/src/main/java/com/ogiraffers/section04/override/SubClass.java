package com.ogiraffers.section04.override;

import java.io.FileNotFoundException;

public class SubClass extends SuperClass {

    // ✅ 오버라이딩 가능: 더 구체적인 예외로 오버라이딩 (FileNotFoundException ⊂ IOException)
    @Override
    public void method() throws FileNotFoundException {
    }

    /* ✅ 오버라이딩 가능: 예외를 아예 던지지 않아도 됨 (예외 제거 가능)
    @Override
    public void method() {
    }
    */

    /* ✅ 오버라이딩 가능: 부모와 동일한 예외 던지기
    @Override
    public void method() throws IOException {
        super.method();
    }
    */

    /* ❌ 오버라이딩 불가능: 부모보다 상위(Exception)는 컴파일 에러
    @Override
    public void method() throws Exception {
    }
    */
}
