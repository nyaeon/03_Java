package com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    /*
     * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여
     * 작성하게 된다.
     * 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성한다.
     */

    // 다이아몬드 연산자 내부에 작성하는 T는 타입변수라고 부른다.

    private T value; //

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
