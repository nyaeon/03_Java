package com.ohgiraffers.section04.parameter;

import java.util.Arrays;

public class ParameterTest {


    public void testPrimitiveTypeParameter(int num) {

        num = 10;

        System.out.println("매개 변수로 전달받은 값 : " + num);

    }

    public void testPrimitvieTypeArrayParameter(int[] iArr) {

       iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();
    }

    public void testVariableLengthArrayParameter(String... str){ // ...을 함으로서 가변인자로 선언
        System.out.println("str = " + Arrays.toString(str));

    }
}
