package com.ohgiraffers.seciton04.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {

        // num = 10;
        System.out.println("매개변수로 전달받은 값 : " + num);
    }
    public void testPrimitiveTypeArrayParameter(int[] iArr) {
        iArr[0] = 100;
        System.out.println(("매개면수로 전달받은 값 : " + Arrays.toString(iArr)));
    }

    public void testClassTypeparameter(Rectangle r) {
        r.calArea();
        r.calRound(); // 얕은 복사
    }
    public void testVariableLengthArrayParameter(String... str) {
        System.out.println("str = " + Arrays.toString(str));
    }
}
