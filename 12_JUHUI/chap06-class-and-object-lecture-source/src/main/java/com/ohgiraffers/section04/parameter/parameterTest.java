package com.ohgiraffers.section04.parameter;

import java.util.Arrays;

public class parameterTest {

    public void testPrimitiveTypeParameter(int num) {

        //num = 10;

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr) {
        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) { // 현재 얕은 복사 상태
        r.calArea();
        r.calRound();
    }

    public void testVariableLengthArrayParameter(String... str) {//String... 가변인자로 만들어준 것.
        System.out.println("str = " + Arrays.toString(str));
    }
}
