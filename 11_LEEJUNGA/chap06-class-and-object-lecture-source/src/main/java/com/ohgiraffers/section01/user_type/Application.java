package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /**
         * 객체지향프로그래밍(OOP : Object Oriented Programming language)
         * 캡슐화, 상속, 추상화, 다형성을 적용하여 유지보수성을 고려한 응집력 높고 결합도 낮은
         * 객체 위주의 개발방식을 적용한 프로그래밍을 말한다.
         *
         * 객체지향의 특징(4대 특징)
         * - 추상화(Abstraction)
         * - 캡슐화(Encapsulation)
         * - 상속(Inheritance)
         * - 다형성(Polymorphism)
         * */

        // 1. 변수를 이요한 회원데이터 관리
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobbies = new String[]{"축구", "볼링", "당구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobbies = " + Arrays.toString(hobbies));

        /*
        * 이렇게 변수들로만 관리할 때 발생하는 문제점
        * 1. 많은 변수명들을 관리하기 힘들 수 있다.
        * 2. 메소드의 전달인자로 전할 값이 너무 많아 회원과 관련된 기능을 호출할 때 매개변수가 많아진다.
        * 3. 메소드의 반환형으로 회원이라는 개념을 반환할 수 없다. (why? 메소드의 반환형은 하나여야 하기 때문에)
        * */

        Member member = new Member();
        Member member2 = new Member();

        System.out.println("member = " + member.name);
//        System.out.println(member.age);
//        System.out.println(member.gender);
        System.out.println("member2 = " + member2.name);

        System.out.println("=========================");

        member.name = "김철수";
        member2.name = "김영희";
        System.out.println("member = " + member.name);
        System.out.println("member2 = " + member2.name);

        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"볼링", "하키"};
        member.id = "user03";
        member.pwd = "pass03";
        System.out.println("member = " + member.gender);

        Member returnValue = returnMember(member);
        System.out.println(returnValue.name);
    }

    public static Member returnMember(Member m) {
        System.out.println("개명을 시작하겠습니다.");
        m.name = "박길동";
        return m;
    }
}
