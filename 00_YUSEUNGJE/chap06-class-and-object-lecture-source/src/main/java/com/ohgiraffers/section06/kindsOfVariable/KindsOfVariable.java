package com.ohgiraffers.section06.kindsOfVariable;

public class KindsOfVariable {

    /*
    * 클래스 영역에 작성하는 변수를 필드라고한다.
    * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미) == 인스턴스변수
    * */

    // non-static field : 인스턴스변수(인스턴스 생성 시점에 사용 가능한 변수라는 의미)
    private int globalNum;
    private int num;

    // static field : 정적필드(클래스변수) => static영역에 생성되는 변수를 의미
    private static int staticNum;

    public void testMethod(int num) { // 메소드영역의 시작
        // 메소드 영역에서 작성하는 변수를 지역변수
        // 메소드의 괄호안에 선언하는 변수를 매개변수
        // 매개변수도 일종의 지역변수로 생각하면된다.
        // 지역변수와 매개변수 모두 메소드 호출 시 stack을 할당받아 stack에 생성된다.
        System.out.println(num); // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화할 필요가 없다.
        int localNum;
//        System.out.println(localNum); // 지역변수는 선언 외에 다시 사용(호출)하기 위해서는 반드시 초기화가 되어야한다.

        System.out.println(globalNum); // 전역변수는 클래스 전역에서 사용가능하다.
        System.out.println(staticNum);
        System.out.println(this.num);

    } // 메소드영역의 끝

    public void testMethod() {
//        System.out.println(localNum); // 지역변수는 해당지역(블럭 내)에서만 사용 가능하다.
        System.out.println(globalNum); // 전역변수는 다른 메소드에서도 사용가능하다.
        System.out.println(staticNum);
    }
}
