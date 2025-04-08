package com.ohgiraffers.section04.parameter;

import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
/***
 * 피라미터로 사용 가능한 자료형
 * 1. 기본자료형
 * 2. 기본자룡형 배열
 * 3. 클래스 자료형(참조자료형)
 * 4. 클래스 자료향 배열(객체 배열이지만 다음쳄터에서 다룰 예정)
 * 5. 가변인자
 */
        Parametertest pt = new Parametertest();
    //1.기본자료형을 매개변수로 전달 받는 메소도 호출
        //리터럴 값(참조 주소값x)을 전달해서 메소드를 호출 시에는 서로 다른 지역 변수는 서로 영향이 없다
        int num =20;
        System.out.println("call bu value 전 :" + num);

        pt.testPrimitivetypeparameter(num);
        System.out.println("call by value 후: " +num);

        // 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출
        int[] iArr = new int[]{1,2,3,4,5}; //iArr에 담은 값은 heap에 생성된 배열의 주소값을 가지고있다
        System.out.println("call by refernce 전:"+ Arrays.toString(iArr));
        pt.testPrimitivetypeparameter(iArr); // 참조값에 의한 호출
        System.out.println("call by refernce 후:"+ Arrays.toString(iArr));
        //3.클래스 자료형을 매개변수로 전달 받는 메소드 호출
        Rectangle r = new Rectangle(22,12);
    //    r.calarea();
    //    r.calround();
        pt.testPrimitivetypeparameter(r);

        //4.클래스 배열은 나중에
        //5. 가변인자를 매개변수로 전달받는 메소드 호출(자바에서 권장하지 않음)
        pt.testvariablelengthArrayparamenter();
        pt.testvariablelengthArrayparamenter("홍길동");
        pt.testvariablelengthArrayparamenter("유관순","탁구");
        pt.testvariablelengthArrayparamenter(new String[]{"강감찬","낚시"});
}
}



