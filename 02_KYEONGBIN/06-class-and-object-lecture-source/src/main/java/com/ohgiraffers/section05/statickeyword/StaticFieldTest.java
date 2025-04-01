package com.ohgiraffers.section05.statickeyword;

public class StaticFieldTest {

    // non-static 필드 (객체별로 별도 존재)
    private int nonStaticCount;

    // static 필드 (모든 객체가 공유)
    private static int staticCount;

    // 생성자
    public StaticFieldTest() {
        // 기본 생성자 (현재는 아무 동작도 안 함)
    }

    // non-static 필드의 값을 반환하는 메서드
    public int getNonStaticCount() {
        return nonStaticCount;
    }

    // static 필드의 값을 반환하는 메서드
    public int getStaticCount() {
        return staticCount;
    }

    // non-static 필드 값을 증가시키는 메서드
    public void increaseNonStaticCount() {
        this.nonStaticCount++;  // 객체별로 증가
    }

    // static 필드 값을 증가시키는 메서드
    public void increaseStaticCount() {
        staticCount++;  // 모든 객체가 공유하는 static 필드 증가
    }

}
