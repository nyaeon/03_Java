package com.ohgiraffers.section04.parameter;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        /*
         * 파라미터로 사용 가능한 자료형
         * 1. 기본자료형
         * 2. 기본자료형 배열
         * 3. 클래스자료형(참조자료형)
         * 4. 클래스자료형 배열(객체 배열이지만 다음 챕터에서 다룰 예정)
         * 5. 가변인자
         */

        // 1. 기본자료형을 매개변수로 전달 받는 메소드 호출
        parameterTest pt = new parameterTest();
        // 리터럴 값(참조 주소값 x)을 연결해서 메소드를 호출 시에는 서로 다른 지역 변수는 서로 영향 x.
        int num = 20; // 20은 리터럴 값. 다른 뜻으로 참조 주소값이 아닌 것임.
        System.out.println("call by value 전 : " + num);
        pt.testPrimitiveTypeParameter(num);
        System.out.println("call by value 후 : " + num);

        // 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출
        int[] iArr = new int[]{1,2,3,4,5}; // iArr에 담긴 값은 heap에 생성된 배열의 주소값을 가지고 있다.
        System.out.println("call by reference 전 :" + Arrays.toString(iArr));
        pt.testPrimitiveTypeArrayParameter(iArr); // 참조값에 의한 호출
        System.out.println("call by reference 후 :" + Arrays.toString(iArr));

        // 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출
        Rectangle r = new Rectangle(22,13);
        r.calArea();
        r.calRound();
        pt.testClassTypeParameter(r);

        // 4. 클래스 배열은 뒤에서 다시

        // 5. 가변인자를 매개변수로 전달받는 메소드 호출(자바는 웬만하면 권장하진 않음)
        pt.testVariableLengthArrayParameter(); // 가변 인자는 인자에 넣지 않으면 빈 배열 출력
        pt.testVariableLengthArrayParameter("홍길동","탁구"); // 문자열인 타입만 맞으면 됨
        pt.testVariableLengthArrayParameter("강감찬", "낚시", "독서");
    }
}
