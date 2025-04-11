package com.ohgiraffers.section06.kindOfVariable;

public class KindsOfVariable {


    /*
    * 클래스 영역에 작성하는 변수를 필드라고 한다.
    * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수 (클래스 전역에서 사용할 수 있는 변수라는 의미) == 인스턴스 변수
    * */

    // non-setatic field : 인스턴스 변수 (인스턴스 생성 시점에 사용 가능한 변수라는 의미)
    private int globalNum;
    private int num;
    // static field : 정적 필드(클래스 변수) => static 영역에 생성되는 변수를 의미
    private static int staticNum;

    public void testMethod(int num){// 메소드 영역의 시작
        // 메소드 영역에서 작성하는 변수를 지역변수
        // 메소드의 괄호안에 선언하는 변수를 매개변수
        // 매개변수도 일종의 지역변수라고 생각하면 된다.
        // 지역변수와 매개변수 모두 메소드 호출 시 stack 영역을 할당 받아서 stack에 생성된다.
        System.out.println(num); // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화를 할 필요가 없다.
        int localNum;
//        System.out.println(localNum); // 지역변수는 선언 외에 다시 사용(호출)하기 위해서는 반드시 초기화가 되어야한다.

        System.out.println(globalNum);
        System.out.println(staticNum);
        System.out.println(this.num);

    } // 메소드 영역의 끝

    public void testMethod(){
//        System.out.println(localNum); //지역변수는 해당지역(블럭 내)에서만 사용가능.
        System.out.println(globalNum); // 전역변수는 다른 메소드에서도 사용이 가능하다.
        System.out.println(staticNum);
    }
}
