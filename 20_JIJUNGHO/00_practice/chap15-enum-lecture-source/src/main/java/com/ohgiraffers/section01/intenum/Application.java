package com.ohgiraffers.section01.intenum;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // 정수 열거 패턴과 이의 단점을 확인
        int subject1 = Subject.JAVA;
        int subject2 = Subject.HTML;

        System.out.println("subject1 = " + subject1);
        System.out.println("subject2 = " + subject2);

        // 둘다 같은 상수이자 숫자일뿐 구분할 수 없다.(런타임 시점에)
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }

        // 이름 충돌 방지를 위해서는 접두어를 써서 구분해야만 한다.(이름과 번호가 같을때)
        // 변수명에 쓰인 이름(문자열을 출력하기 어렵다. (feat.switch))
        Scanner sc = new Scanner(System.in);
        System.out.print("과목 번호를 눌러주세요(0 ~ 2) : ");
        int fieldNo = sc.nextInt();

        String subName = "";

        switch (fieldNo) {
            case Subject.JAVA: subName = "JAVA"; break;
            case Subject.MYSQL: subName = "MYSQL"; break;
            case Subject.JDBC: subName = "JDBC"; break;
        }

        System.out.println("선택한 과목명은 = " + subName + "입니다.");

        // 같은 클래스에 속한 상수들을 순회(반복자/반복문)할 수 없다. (필드가 총 몇개고 어떤 필드들이 있는지))
        // 타입의 안정성을 보장 할 수 없음
        printSubjects(Subject.JAVA);
        printSubjects(0); // 그냥 숫자의 개념도 허용이된다.

    }

    private static void printSubjects(int subjectName) {

    }

}
