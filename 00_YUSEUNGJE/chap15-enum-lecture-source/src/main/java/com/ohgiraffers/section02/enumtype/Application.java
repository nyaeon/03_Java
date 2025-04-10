package com.ohgiraffers.section02.enumtype;

public class Application {

    public static void main(String[] args) {

        Subjects subject1 = Subjects.JAVA;
        System.out.println(subject1);
        Subjects subject2 = Subjects.HTML;
        System.out.println(subject2);
        Subjects subject3 = Subjects.JAVA;
        System.out.println(subject3);


        /*
        * 1. 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리되며 인스턴스가 각각 한 개임을 보장한다.
        *    작성한 순서에 따라 각각은 다른 인스턴스가 생성되며 최초 호출 시에 enum의 생성자를 활용해 생성된다.
        *    (lazy singleton 개념)
        * */
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다.");
        } else {
            System.out.println("서로 다른 과목이다.");
        }

        if(subject1 == subject3){
            System.out.println("싱글톤이다.");
        }
    }
}
