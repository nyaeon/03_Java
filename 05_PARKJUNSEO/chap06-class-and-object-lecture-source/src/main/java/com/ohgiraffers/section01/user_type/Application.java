package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {

        /* 객체지향프로그래밍(OOP: Object-Oriented Programming Language)
         * 캡슐화, 상속, 다형성 + 추상화를 적용해서 유지/보수성을 고려한 응집력이 높고 결합도가 낮은
         * 객체 위주의 개발 방식을 적용한 프로그래밍을 말함
         *
         * 객체지향의 특징 (4대 특징)
         * - 추상화 (Abstraction)
         * - 캡슐화 (Encapsulation)
         * - 상속 (Inheritance)
         * - 다형성 (Polymorphism)
         */

        // 1. 변수를 이용한 회원 데이터 관리
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobbies = new String[]{"축구", "야구", "볼링"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobbies = " + hobbies);

        /*
         * 이렇게 변수들로만 관리할 때 발생할 수 있는 문제점
         * 1. 많은 변수명들을 관리하기 힘들 수 있다.
         * 2. 메소드의 전달인자로 전할 값이 너무 많아 회원과 관련된 기능을 호출할 떄 매개변수가 많아진다.
         * 3. 메소들의 반환형으로 회원이라는 개념을 반환할 수 없다. (메소드의 반환형은 하나여야 하기 때문에)
         */

        // 두 명의 회원 객체를 만들었다.
        Member member = new Member();  // 새로운 클래스를 만듦 -> 사용자 정의 타입
        Member member2 = new Member();
        System.out.println("member = " + member.name);
//      System.out.println(member.name);
//      System.out.println(member.gender);
        System.out.println("member2 = " + member2.name);

        member.name = "오지환";
        member2.name = "홍창기";
        System.out.println("member = " + member.name);;
        System.out.println("member2 = " + member2.name);

        member.age = 30;
        member.gender = '남';
        member.hobby = new String[] {"볼링", "하키"};
        member.id = "user03";
        member.pwd = "pass03";
        System.out.println("member = " + member.gender);
    }

//    public static 반환형 modifyMember() {
//        -> 반환형 뭐로 해야하지
//        -> 일반적인 방법으로는 답이 없음. 배열로 해도 자료형을 통일시켜야 해서 힘듦
//        -> 이럴 때는 같은 패키지에 만든 Member라는 클래스를 쓰면 좋음
//    }


}
