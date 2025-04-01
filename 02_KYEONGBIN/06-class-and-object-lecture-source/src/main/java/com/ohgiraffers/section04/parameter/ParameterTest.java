package com.ohgiraffers.section04.parameter;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {

    }

    public void testPrimitiveTypeParameter(int[] iArr) {

        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값: " + Arrays.toString(iArr));

    }
    public void testPrimitiveTypeParameter(Rectangle r) {

        r.calArea();
        r.caldul();


    }

    public void testVariableLengthArrayParameter(String... str) { // ...을 쓰면 가변 인자로 된거라고 함...?

        System.out.println("str = " + Arrays.toString(str));

    }

}
