package com.ohgiraffers.section06;

public class kindsOfVariable {

    /*
    * 클래스 영역에 작성하는 변수를 필드라고 한다.
    * 필드 == 멤버변수 (클래스가 가지는 멤버라는 의미) == 전역변수 (클래스 전역에서 사용할 수 있는 변수라는 의미) == 인스턴스 변수
     */

    // non-static field : 인스턴스 변수 (인스턴스 생성 시점에 사용 가능한 변수라는 의미)
    private int globalNum;
    private int num;

    // static field : 정적 필드 (클래스 변수) => static 영역에 생성되는 변수를 의미
    private static int staticNum;

    public void testMethod(int num) { // 메소드 영역의 시작
        // 메소드 영역에서 작성하는 변수를 지역변수
        // 메소드의 괄호 안에 선언하는 변수를 매개변수
        // 매개변수도 일종의 지역변수로 생각하면 된다.
        // 지역변수와 매개변수 모두 메소드 호출 시에 stack 영역을 할당받아 stack에 생성된다.
        System.out.println(num);  // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화할 필요가 없다.
        int localNum;
        // System.out.println(localNum);  // 지역변수는 선언 외에 다시 호출하기 위해서는 반드시 초기화가 되어야 한다. 지금은 초기화를 안 했기 때문에 출력할 게 없다.
        System.out.println(globalNum); // 전역변수는 클래스 전역에서 사용 가능하다.
        System.out.println(staticNum);
        System.out.println(this.num);
        // 메소드는 전역변수보다 지역변수를 우선함. 이름이 같으면 지역변수를 먼저 출력함. 만약 전역변수를 쓰고 싶으면 this.를 붙인다.



    } // 메소드 영역의 끝
}
