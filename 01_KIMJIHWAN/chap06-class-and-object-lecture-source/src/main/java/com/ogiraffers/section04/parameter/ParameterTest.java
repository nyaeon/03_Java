package com.ogiraffers.section04.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitveTypeParameter(int num) {

//        int num = 10;

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimitveTypeParameter(int[] iArr) {

//        iArr[0] = 100;
        System.out.println("매개변수로 전달받은 값 : " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();
    }

    public void testVariableLengthArrayParameter(String... str) {
//    public void testVariableLengthArrayParameter(String num, String... str) { // ++ 가변인자는 뒤에 위치해야 하며 앞에는 몇개든 상관없음
        System.out.println("str = " + Arrays.toString(str));

    }
}
