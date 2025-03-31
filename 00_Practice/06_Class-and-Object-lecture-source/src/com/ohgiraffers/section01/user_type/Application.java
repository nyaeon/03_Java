package com.ohgiraffers.section01.user_type;


public class Application {
    public static void main(String[] args) {

        Member member = new Member();

        // 1. 변수를 이용한 회원 데이터 관리
        String id = "user01";
        String pwd = "password";
        String name = "name";
        int age = 20;
        char gender = 'M';
        String[] hobbies = {"bowling", "ping-pong", "soccer"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobbies = " + hobbies);

        // 변수만 사용할 때 발생하는 문제점
        // 1. 변수 개수가 많아 관리가 어렵다.
        // 2. 메소드 호출 시 매개변수가 너무 많아진다.
        // 3. 회원 정보를 하나의 객체로 반환할 수 없다. (메소드 반환값은 하나여야 함)

        Member member1 = new Member();
        Member member2 = new Member();

        System.out.println("member1 = " + member1);
        System.out.println();
        System.out.println(member2.age);
        System.out.println(member2.gender);
        System.out.println("member2 = " + member2);

        member1.name = "Kevin";
        member1.age = 18;
        member1.gender = 'M';
        member1.hobbies = new String[] {"bowling", "ping-pong", "soccer"};
        member1.id = "kevin_said";
        member2.name = "Andrew";
        member2.age = 30;
        member2.gender = 'M';
        member2.hobbies = new String[] {"bowling", "ping-pong", "soccer"};
        member2.id = "andrew_said";

        System.out.println("member1 = " + member1.name);
        System.out.println("member2 = " + member2.name);



    }


    public static Member returnMember(Member m) {
        // 메서드가 실행되면 "Start to rename."이 출력됩니다.
        System.out.println("Start to rename.");

        // 매개변수로 받은 Member 객체 m의 필드(속성) 값들을 변경합니다.
        m.name = "Kevin";  // m 객체의 name 필드를 "Kevin"으로 변경
        m.age = 18;        // m 객체의 age 필드를 18로 변경
        m.gender = 'M';    // m 객체의 gender 필드를 'M'으로 변경

        // 변경된 m 객체를 다시 반환합니다.
        return m;
    }
}
