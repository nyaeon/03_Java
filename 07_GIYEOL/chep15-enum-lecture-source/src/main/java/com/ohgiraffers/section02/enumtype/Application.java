package com.ohgiraffers.section02.enumtype;

public class Application {
    public static void main(String[] args) {
        Subjects subject1 = Subjects.JAVA;
        System.out.println(subject1);
        Subjects subject2 = Subjects.HTML;
        System.out.println(subject2);
        Subjects subject3 = Subjects.JAVA;
        System.out.println(subject3);
        /***
         * 1.열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 각각 한 개입을 보장
         * 작성한 순서에 따라 각각은 다른 인스턴스가 생성되며 최초 호출시에 enum의 생성자를 활용해 생성됨
         * (lazy singlton 개념)
         */
        if (subject1 == subject2) {
            System.out.println("같음");
        } else {
            System.out.println("서로 다름");
        }
        //단일 인스턴스임을 보장하기에 == 비교가 가능하다 (동일 객체 비교가 가능)
        if (subject1 == subject3) {
            System.out.println("싱글톤이다");
        }
        //오버라이딩 되지 않은 toString() 또는 name() 메소드를 활용하여 필드명을 문자열로 변경하기 쉽다
        System.out.println(Subjects.JAVA);
        System.out.println(Subjects.JAVA.name());

        //이름 충돌 방지를 위해 접두사를 쓰지 않아도 Enum타입별로 네임스페이스를 가짐
        Subjects.BackEnd javascript = Subjects.BackEnd.JAVASCRIPT;
        System.out.println(javascript);
        Subjects.FrontEnd Javascript2 = Subjects.FrontEnd.JAVASCRIPT;
        System.out.println(Javascript2);
        System.out.println("==============================================");
        //values() 이용해 상수값 배열을 반환받고 이를 활용하여 연속처리를 해준다
        Subjects[] subjects = Subjects.values();
        for (Subjects subject : subjects) {
            System.out.println(subject.toString());
            System.out.println(subject.name());
            System.out.println(subject.ordinal());
        }
        System.out.println("===============================");
        Subjects.BackEnd[] subjects2 = Subjects.BackEnd.values();
        for (Subjects.BackEnd subject : subjects2) {
            System.out.println(subject.toString());
        }
     //  printSubjects(Subjects.CSS);
     //  public static void printSubjects(Subjects subject){
     //      System.out.println(subject.toString());
     //  }
    }

    }

