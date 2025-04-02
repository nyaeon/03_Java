package com.ohgiraffers.section06.kindsofvariable;

public class Kindofvariable {

    /***
     * 클래스 영역에 작성하는 변수를 필드라도 한다
     * 필드 == 멤버 변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미) == 인스턴스변수
     *
     * non-static field : 인스턴스 변수(인스턴스 생성 시점에 사용 가능한 변수라는 의미)
     */
    private int globalnum;
    private int num;
    //static field : 정적 필드(클래스 변수) => static 영역에 생성되는 변수를 의미
    private static int staticnum;

    public void testmethod(int num) {// 메소드 영역의 시작}
        //메소드 영역에서 작성하는 변수를 지역변수
        // 메소드의 괄호 안에 선언하는 변수를 매개변수
        //지역변수의 일종의 지역변수로 생각하면됨
        //지역변수와 매개변수 모두 메소드 호출시 stack을 할당받아 stack에 생성됨
        System.out.println(num); //매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화할 필요가 없다
        int localnum; 
        //System.out.print(localnum); 지역변수는 선언외에 다시 사용,호출하기 위해서는 반드시 초기화가 되어야 한다

        System.out.println(globalnum); //전역변수는 클래스 전역에서 사용 가능
        System.out.println(staticnum);
        System.out.println(this.num);

    }//메소드 영역의 끝
    public void testmethod(){
        System.out.println(globalnum); //전역변수는 다른 메소드에서 사용 가능
        System.out.println(staticnum);
    }
}