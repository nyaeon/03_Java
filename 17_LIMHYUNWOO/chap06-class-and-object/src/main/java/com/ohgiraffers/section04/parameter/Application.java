package com.ohgiraffers.section04.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*
         * 파라미터로 사용 가능한 자료형
         * 1. 기본자료형
         * 2. 기본자료형 배열
         * 3. 클래스자료형(참조자료형)
         * 4. 클래스자료형 배열(객체 배열이지만 다음쳅터에서 다룰예정)
         * 5. 가변인자
         */

        ParameterTest pt = new ParameterTest();

        // 1. 기본자료형을 매개변수로 전달받는 메소드 호출  //값만 전달하기 때문에 값이 안바뀜
        // 리터럴 값(참조 주소값 X)을 전달해서 메소드를 호출 시에는 서로 다른 지역 변수는 서로 양향 X
        int num = 20;
        System.out.println("call by value 전 : " + num);
        pt.testPrimitiveTypeParameter(20);
        System.out.print("call by value 후 : " + num);

        // 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출   //얕은복사로 주소값을 보내기 때문에 값이 바뀜
        int[] iArr = new int[]{1,2,3,4,5}; // iArr에 담긴 값은 heap에 생성된 배열의 주소값을 가지고있다.
        System.out.println("call by reference 전 : " + Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayParameter(iArr);  // 참조값에 의한 호출 진행
        System.out.println("call by reference 후 : " + Arrays.toString(iArr));

        // 3.클래스 자료형을 매개변수로 전달 받는 메소드 호출
        Rectangle r = new Rectangle(22,12);
//        r.calArea();
//        r.calRound();
        pt.testClassTypeParameter(r);
        // 4. 클래스배열은 뒤에서 다시

        // 5. 가변인자를 매개변수로 전달받는 메소드 호출(자바는 왜남ㄴ하면 권장X)
        pt.testVariableLengthArrayParameter("홍길동");
        pt.testVariableLengthArrayParameter("홍길동","유관순");
        pt.testVariableLengthArrayParameter("강감찬","낚시","독서");
    }
}
