package com.ohgiraffers.section02.enumtype;

import com.ohgiraffers.section01.intenum.Subject;

public class Application {

    public static void main(String[] args) {

        Subjects subject1 = Subjects.JAVA;
        System.out.println(subject1);   // JAVA

        Subjects subject2 = Subjects.HTML;
        System.out.println(subject2);
        Subjects subject3 = Subjects.JAVA;
        System.out.println(subject3);

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다.");
        }
        System.out.println("서로 다른 과목이다.");

        // 싱글톤 : 한 번 만들어진 주소를 공유

        // 단일 인스턴스를 보장하기 때문에 == 비교가 가능하다. (동일 객체 비교가 가능하다)
        if (subject1 == subject3) {
            System.out.println("싱글톤이다");
        }

        // 오버라이딩 되지 않은 toString() 또는 name() 메소드를 활용하여 필드명을 문자열로 변경하기 쉽다.
        System.out.println(Subjects.JAVA);  // 뒤에 toString이 생략되어있음
        System.out.println(Subjects.JAVA.name());  // 저절로 name()이라는 메소드가 제공되고 있음


        // 이름 충돌 방지를 위해 접두사를 쓰지 않아도 Enum 타입별로 네임 스페이스를 가진다.
        Subjects.Backend javascript = Subjects.Backend.JAVASCRIPT;
        System.out.println("javascript = " + javascript);

        Subjects.Frontend frontend2 = Subjects.Frontend.JAVASCRIPT;
        System.out.println("frontend2 = " + frontend2);

        System.out.println("================================================");

        // values()를 이용하여 상수값 배열을 반환받고 이를 활용하여 연속처리를 해줄 수 있다.
        Subjects[] subjects = Subjects.values();
        for (Subjects subject : subjects) {
            System.out.println(subject.toString());
            System.out.println(subject.name());     // 이름만
            System.out.println(subject.ordinal());  // enum이 가지고 있는 순번을 가져와서 쓸 수도 있음
        }

        System.out.println("=====================================================");

        // 이렇게 하면 백엔드에 있는 것만 가져다 쓸 수 있음
        Subjects.Backend[] subjects2 = Subjects.Backend.values();
        for (Subjects.Backend subject : subjects2) {
            System.out.println(subject.toString());
        }

        printSubjects(Subjects.CSS); // 타입 안정성 ->subject 타입만 넣을 수 있음
        printSubjects(Subjects.JAVASCRIPT);

    }

    public static void printSubjects(Subjects subject) {
        System.out.println(subject.toString());
    }



}

