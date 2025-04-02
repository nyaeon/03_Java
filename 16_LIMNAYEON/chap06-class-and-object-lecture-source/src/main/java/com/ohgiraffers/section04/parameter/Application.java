package com.ohgiraffers.section04.parameter;

import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        /*
         * 파라미터로 사용 가능한 자료형
         * 1. 기본 자료형
         * 2. 기본 자료형 배열
         * 3. 클래스 자료형(참조 자료형)
         * 4. 클래스 자료형 배열(객체 배열이지만 다음 쳅터에서 다룰 예정)
         * 5. 가변인자
         */

        ParameterTest pt = new ParameterTest();
        // 1. 기본자료형을 매개변수로 전달 받는 메소드 호출
        // 리터럴 값(참조 주소값x)
        int num = 20;
        System.out.println("call by value 전 : " + num);
        pt.testPrimitiveTypeparameter(num);
        System.out.println("call by value 후 : " + num);

        // 2. 기본 자료형 배열을 매개변수로 전달 받는 메소드 호출
        int[] iArr = new int[] {1, 2, 3, 4, 5}; // iArr에 담긴 값은 heap에 생성된 배열의 주소값을 가지고 있다.
        System.out.println("call by reference 전 : " + Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayparameter(iArr);
        System.out.println("call by value 후 : " + Arrays.toString(iArr));

        // 3. 클래스 자료형을 매개변수로 전달 받는 메소드
        Rectangle r = new Rectangle(22, 12);
//        r.calArea();
//        r.calRound();
        pt.testClassTypeRarameter(r);

        // 4. 클래스배열은 뒤에서 다시
        // 5. 가변인자를 매개변수로 전달받는 메소드 호출(자바는 웬만하면 권장하지 않는다.)
        pt.testVariableLengthArrayParameter();
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("유관순", "탁구");
        pt.testVariableLengthArrayParameter(new String[]{"강감찬", "축구", "독서"});
    }
}
