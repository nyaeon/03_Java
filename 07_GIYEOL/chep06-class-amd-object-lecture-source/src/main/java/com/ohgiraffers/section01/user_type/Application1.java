package com.ohgiraffers.section01.user_type;

public class Application1 {
    public static void main(String[] args) {
        /***
         * 객체지향프로그래밍(oop;obhext oriented programming language)
         * 캡슐화, 상속, 다형성, 추상화 을 적용하여 유지보수성을 고려한 응집력 높고 결합도 낮은
         * 객체 위주의 개발 방식을 적용한 프로그래밍을 말함
         * 객체지향 특정
         * 캡슐화(E)
         * 상속 (i)
         * 다형성(p)
         * 추상화(A)(추상화를 제회하면 3대 특징)
         */
        //변수를 이용한 회원 데이터 관리

        String ID ="user01";
        String pwd ="user02";
        String name ="user03";
        int age =20;
        char gender ='m';
        String[] hobby = new String[]{"게임","당구","축구"};
        System.out.println("id="+ID);
        System.out.println("pwd="+pwd);
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("gender="+gender);
        System.out.println("hobby="+hobby);

        /***
         *
         * 문제점
         * 1.많은 변수명들을 관리하기 힘들 수 있다
         * 2.메소드의 전달인자로 전핳 값이 너무 많아 회원과 관련된 기능을 호출할 떄 매개변수가 많아짐(나쁜코드)
         * 3.메소드의 반환형으로 회원이라는 개념을 반환할 수 없다(메소드의 반환형은 하나여야 하기 때문)
         */

        //두 명의 회원 객체를 만들었다.
        Member member =new Member();
        Member member2 =new Member();
       System.out.println("Member="+member.name);
        //System.out.println("Member="+member.age);
        //(System.out.println("Member="+member.gander);
        System.out.println("Member2="+member2.name);


    member.name ="김철수";
    member2.name ="김영희";
    System.out.println("Member ="+member.name);
    System.out.println("Member2="+member2.name);
    member.age=30;
    member.gender ='m';
    member.hobby= new String[]{"볼링","하키"};
    member.ID="user03";
    member.pwd ="pass03";
    System.out.println("member ="+member.gender);
    }
    public static Member reteurn(Member m){
    System.out.print("개명을 시작");
    m.name = "박길동";
    return m;
    }
}
