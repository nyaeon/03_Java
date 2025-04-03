package com.ohgiraffers.section04.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {

        num = 10;

        System.out.println("매개변수로 전달받은 값");
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr) {
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값" + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();    // 얕은 복사
    }

    public void testVariableLengthArrayParameter(String... str) {      // 넘겨주는 객체만큼 알아서 배열로 만들어줌
        System.out.println("str = " + Arrays.toString(str));
    }
}
